package com.PnPbackEnd.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PnPbackEnd.crud.Entity.Courier;

public interface CourierRepository extends JpaRepository<Courier, Long> {
	
}
