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

import com.PnPbackEnd.crud.Entity.Courier;
import com.PnPbackEnd.crud.repository.CourierRepository;

@RestController
@RequestMapping("/Courier")
public class CourierController {
	@Autowired
	private CourierRepository courierRepos;
	
	@GetMapping("/courier/{id}")
	public Optional<Courier> getProduct(@PathVariable Long id){
		return courierRepos.findById(id);
	}
	
	@DeleteMapping("/courier/{id}")
	public boolean deleteCourier(@PathVariable Long id){
		courierRepos.deleteById(id);
		return true;
	}
	//
	@PostMapping("/courier/{id}")
	public Courier addCourier(Courier courier) {
		return courierRepos.save(courier);
	}
	//
	@PutMapping("/courier/{id}")
	public Courier updateCourier(Courier courier) {
		return courierRepos.save(courier);
	}
}
