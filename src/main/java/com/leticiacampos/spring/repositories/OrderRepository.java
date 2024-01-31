package com.leticiacampos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticiacampos.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}