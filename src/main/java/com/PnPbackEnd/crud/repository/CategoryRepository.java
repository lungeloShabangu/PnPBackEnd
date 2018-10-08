package com.PnPbackEnd.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.PnPbackEnd.crud.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
	
}
