package com.easantos.springboot_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easantos.springboot_jpa.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {

}
