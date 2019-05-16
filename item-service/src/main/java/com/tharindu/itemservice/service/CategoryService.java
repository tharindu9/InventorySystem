package com.tharindu.itemservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tharindu.itemservice.modal.Category;


public interface CategoryService {
	
	Category  save(Category category);
	List<Category> fetchAllCategory();

}
