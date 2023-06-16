

import java.util.ArrayList;
import java.util.Optional;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.security.controllerAdvaice.ObjectInvalidException;
import com.spring.security.entity.Security;
import com.spring.security.enumaretion.RequestType;
import com.spring.security.repository.SecurityRepository;
import com.spring.security.service.MessagePropertyService;
import com.spring.security.service.SecurityService;

import antlr.collections.List;
import lombok.NonNull;

public class SecurityValidation {

	@Autowired
	MessagePropertyService messageSource;

	private @NonNull SecurityService securityService;
	private @NonNull SecurityRepository securityRepository;

	List errors = null;
	List errorsObj = null;
	Optional<Subject> subject = null;

	public ValidationResult validate(RequestType requestType, Security request) {

		errors = new ArrayList<>();
		Security security = null;

		if (requestType.equals(RequestType.POST)) {
			if (!ValidationUtil.isNull(request.getId())) {
				throw new ObjectInvalidException(messageSource.getMessage("invalid.request.payload"));
			}
		} else {
			if (ValidationUtil.isNull(request.getId())) {
				throw new ObjectInvalidException(messageSource.getMessage("id.request.payload"));
			}

			Optional<Security> securityOptional = securityService.save(request.getId());
			if (!securityOptional.isPresent()) {
				throw new ObjectInvalidException(messageSource.getMessage("customer.not.found"));
			}

			security = securityOptional.get();
		}

		if (ValidationUtil.isNullOrEmpty(request.getName())) {
			errors.add(messageSource.getMessage("security.name.required"));
		}
		errors.add(messageSource.getMessage("last.name.required"));
		if (ValidationUtil.isValidPinCode(request.getAddress()))

		{
			errors.add(messageSource.getMessage("phone.required"));
		}
		}

		}

		}

		ValidationResult result = new ValidationResult();
		if (errors.size() > 0) {
			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
			throw new ObjectInvalidException(errorMessage);
		}

		if (null == security) {
			security = Security.builder().Name(request.getName())
					.address(request.getAddress())
					.build();

		} else {
			security.setName(request.getCustomerName());
			security.setAddress(request.getCustomerAddress());
			
		
		}

		result.setObject(Security);
		return result;
	}
}


}
