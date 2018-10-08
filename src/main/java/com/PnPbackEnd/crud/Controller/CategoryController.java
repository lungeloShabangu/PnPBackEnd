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

import com.PnPbackEnd.crud.Entity.Category;
import com.PnPbackEnd.crud.repository.CategoryRepository;

@RestController
@RequestMapping("/Category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepos;
	

	@GetMapping("/category/{id}")
	public Optional<Category> getCategory(@PathVariable Long id){
		return categoryRepos.findById(id);
	}
	
	@DeleteMapping("/category/{id}")
	public boolean deleteCategory(@PathVariable Long id){
		categoryRepos.deleteById(id);
		return true;
	}
	
	@PostMapping("/category/{id}")
	public Category addCategory(Category category) {
		return categoryRepos.save(category);
	}
	
	@PutMapping("/category/{id}")
	public Category updateCategory(Category category) {
		return categoryRepos.save(category);
	}
}
