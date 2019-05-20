package com.tharindu.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tharindu.itemservice.modal.Category;


public interface CategoryService {
	
	Category  save(Category category);
	List<Category> fetchAllCategory();
	Category fetchCategory(Integer id);
	Category updateCategory(Category category);
	void deleteCategory(Category category);

}
