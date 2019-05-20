package com.tharindu.itemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tharindu.itemservice.modal.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
