package com.PnPbackEnd.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PnPbackEnd.crud.Entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
