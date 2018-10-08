package com.PnPbackEnd.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PnPbackEnd.crud.Entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{
	
}
