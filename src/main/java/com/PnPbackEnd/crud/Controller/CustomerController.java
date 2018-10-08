package com.PnPbackEnd.crud.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PnPbackEnd.crud.Entity.Customer;
import com.PnPbackEnd.crud.repository.CustomerRepository;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepos;

	@GetMapping("/customer/{id}")
	public Optional<Customer> getProduct(@PathVariable Long id){
		return customerRepos.findById(id);
	}
	
	@DeleteMapping("/customer/{id}")
	public boolean deleteCustomer(@PathVariable Long id){
		customerRepos.deleteById(id);
		return true;
	}
	
	@PostMapping("/customer/{id}")
	public Customer addCustomer(Customer customer) {
		return customerRepos.save(customer);
	}
	
	@PutMapping("/customer/{id}")
	public Customer updateCustomer(Customer customer) {
		return customerRepos.save(customer);
	}
}
