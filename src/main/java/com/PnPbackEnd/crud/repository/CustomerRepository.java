package com.PnPbackEnd.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PnPbackEnd.crud.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
