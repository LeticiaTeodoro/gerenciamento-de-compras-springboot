package com.leticiacampos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticiacampos.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}