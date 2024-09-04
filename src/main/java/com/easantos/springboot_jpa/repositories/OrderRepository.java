package com.easantos.springboot_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easantos.springboot_jpa.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

}
