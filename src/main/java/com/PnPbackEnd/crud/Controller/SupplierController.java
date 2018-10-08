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
import com.PnPbackEnd.crud.Entity.Supplier;
import com.PnPbackEnd.crud.repository.SupplierRepository;

@RestController
@RequestMapping("/Supplier")
public class SupplierController {
	
	@Autowired
	private SupplierRepository supplierRepos;
	
	// Method for getting on specific product
	@GetMapping("/supplier/{id}")
	public Optional<Supplier> getSupplier(@PathVariable Long id){
		return supplierRepos.findById(id);
	}
	
	// Method for deleting supplier
	@DeleteMapping("/supplier/{id}")
	public boolean deleteSupplier(@PathVariable Long id){
		supplierRepos.deleteById(id);
		return true;
	}
	
	@PostMapping("/supplier/{id}")
	public Supplier addSupplier(Supplier supplier) {
		return supplierRepos.save(supplier);
	}
	
	@PutMapping("/supplier/{id}")
	public Supplier updateSupplier(Supplier supplier) {
		return supplierRepos.save(supplier);
	}
}
