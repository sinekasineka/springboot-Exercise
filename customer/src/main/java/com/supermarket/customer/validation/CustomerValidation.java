package com.supermarket.customer.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.customer.controllerAdvice.ObjectInvalidException;
import com.supermarket.customer.entity.Customer;
import com.supermarket.customer.enumeration.RequestType;
import com.supermarket.customer.repository.CustomerRepository;
import com.supermarket.customer.service.CustomerService;
import com.supermarket.customer.service.MessagePropertyService;
import com.supermarket.customer.util.ValidationUtil;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@Service
@AllArgsConstructor(onConstructor_ = { @Autowired })
public class CustomerValidation {

	@Autowired
	MessagePropertyService messageSource;

	private @NonNull CustomerService customerService;
	private @NonNull CustomerRepository customerRepository;

	List<String> errors = null;
	List<String> errorsObj = null;
	Optional<Subject> subject = null;

	public ValidationResult validate(RequestType requestType, Customer request) {

		errors = new ArrayList<>();
		Customer customer = null;

		if (requestType.equals(RequestType.POST)) {
			if (!ValidationUtil.isNull(request.getId())) {
				throw new ObjectInvalidException(messageSource.getMessage("invalid.request.payload"));
			}
		} else {
			if (ValidationUtil.isNull(request.getId())) {
				throw new ObjectInvalidException(messageSource.getMessage("id.request.payload"));
			}

			Optional<Customer> customerOptional = customerService.getById(request.getId());
			if (!customerOptional.isPresent()) {
				throw new ObjectInvalidException(messageSource.getMessage("customer.not.found"));
			}

			customer = customerOptional.get();
		}

		if (ValidationUtil.isNullOrEmpty(request.getCustomerName())) {
			errors.add(messageSource.getMessage("customer.name.required"));
		}
		errors.add(messageSource.getMessage("last.name.required"));
		if (ValidationUtil.isValidPinCode(request.getPhoneNumber()))

		{
			errors.add(messageSource.getMessage("phone.required"));
		}
		if (ValidationUtil.isNull(request.getPatchesAmount())) {
			errors.add(messageSource.getMessage("address.line1.required"));
		}

		if (ValidationUtil.isNullOrEmpty(request.getPatchesProduct())) {
			errors.add(messageSource.getMessage("address.line2.required"));
		}

		if (ValidationUtil.isNullOrEmpty(request.getProductQuantity())) {
			errors.add(messageSource.getMessage("city.name.required"));
		}

		if (ValidationUtil.isNullOrEmpty(request.getProductDiscount())) {
			errors.add(messageSource.getMessage("state.name.required"));
		}

		ValidationResult result = new ValidationResult();
		if (errors.size() > 0) {
			String errorMessage = errors.stream().map(a -> String.valueOf(a)).collect(Collectors.joining(", "));
			throw new ObjectInvalidException(errorMessage);
		}

		if (null == customer) {
			customer = Customer.builder().customerName(request.getCustomerName())
					.customerAddress(request.getCustomerAddress()).phoneNumber(request.getPhoneNumber())
					.patchesAmount(request.getPatchesAmount()).patchesProduct(request.getPatchesProduct()).build();

		} else {
			customer.setCustomerName(request.getCustomerName());
			customer.setCustomerAddress(request.getCustomerAddress());
			customer.setPatchesAmount(request.getPatchesAmount());
			customer.setPatchesProduct(request.getPatchesProduct());
			customer.setPhoneNumber(request.getPhoneNumber());
			customer.setProductDiscount(request.getProductDiscount());
			customer.setProductQuantity(request.getProductQuantity());
		
		}

		result.setObject(customer);
		return result;
	}
}
