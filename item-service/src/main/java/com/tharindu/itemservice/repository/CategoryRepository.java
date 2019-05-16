package com.tharindu.itemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tharindu.itemservice.modal.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
