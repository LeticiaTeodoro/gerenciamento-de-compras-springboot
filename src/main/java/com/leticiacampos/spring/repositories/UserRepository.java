package com.leticiacampos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticiacampos.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}