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
import com.PnPbackEnd.crud.Entity.Order;
import com.PnPbackEnd.crud.repository.OrderRepository;

@RestController
@RequestMapping("/Order")
public class OrderController {

	@Autowired
	private OrderRepository orderRepos;
	
	// Method for getting on specific product
	@GetMapping("/order/{id}")
	public Optional<Order> getOrder(@PathVariable Long id){
		return orderRepos.findById(id);
	}
	
	// Method for deleting product
	@DeleteMapping("/order/{id}")
	public boolean deleteOrder(@PathVariable Long id){
		orderRepos.deleteById(id);
		return true;
	}
	
	@PostMapping("/order/{id}")
	public Order addOrder(Order order) {
		return orderRepos.save(order);
	}
	
	@PutMapping("/order/{id}")
	public Order updateOrder(Order order) {
		return orderRepos.save(order);
	}
}
