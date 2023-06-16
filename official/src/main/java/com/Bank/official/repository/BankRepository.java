package com.Bank.official.repository;

import com.Bank.official.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BankRepository  extends JpaRepository<Bank,Integer> {

}
