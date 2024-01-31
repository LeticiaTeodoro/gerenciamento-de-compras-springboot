package com.leticiacampos.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leticiacampos.spring.entities.Order;
import com.leticiacampos.spring.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> user = orderRepository.findById(id);
		return user.get();
	}
}