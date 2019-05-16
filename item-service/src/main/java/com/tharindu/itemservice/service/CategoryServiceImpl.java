package com.tharindu.itemservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tharindu.itemservice.modal.Category;
import com.tharindu.itemservice.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public Category  save(Category category) {
		return categoryRepository.save(category);
	}
	 
	@Override
	public List<Category> fetchAllCategory(){
		
		return categoryRepository.findAll();
		
	}

}
