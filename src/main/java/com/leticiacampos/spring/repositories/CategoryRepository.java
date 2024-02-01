package com.leticiacampos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticiacampos.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}