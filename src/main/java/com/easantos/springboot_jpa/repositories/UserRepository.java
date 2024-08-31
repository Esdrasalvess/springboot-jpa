package com.easantos.springboot_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easantos.springboot_jpa.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
