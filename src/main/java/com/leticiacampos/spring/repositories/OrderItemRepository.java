package com.leticiacampos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticiacampos.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}