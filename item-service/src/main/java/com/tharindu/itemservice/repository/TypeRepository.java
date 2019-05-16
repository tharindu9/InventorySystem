package com.tharindu.itemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tharindu.itemservice.modal.ItemType;


public interface TypeRepository extends JpaRepository<ItemType, Integer> {

}
