package com.PnPbackEnd.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PnPbackEnd.crud.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
