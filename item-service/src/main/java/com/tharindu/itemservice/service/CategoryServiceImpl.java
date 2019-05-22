package com.tharindu.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tharindu.itemservice.modal.Category;
import com.tharindu.itemservice.modal.ItemType;
import com.tharindu.itemservice.repository.CategoryRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public Category  save(Category category) {
		for(ItemType itemType : category.getTypes()) {
			itemType.setCategory(category);
		}
		return categoryRepository.save(category);
	}
	 
	@Override
	public List<Category> fetchAllCategory(){
		return categoryRepository.findAll();
	}
	
	@Override
	public Category fetchCategory(Integer id){
		Optional<Category> opCategory = categoryRepository.findById(id);
		if(opCategory.isPresent()) {
			return opCategory.get();
		}
		else {
			return null;
		}
	}
	
	@Override
	public Category updateCategory(Category category){
		Integer id = category.getId();
		Optional<Category> opCategory = categoryRepository.findById(id);
		if(opCategory.isPresent()) {
				 return categoryRepository.save(category);
		}
		else {
			return null;
		}
	}
	
	@Override
	public void deleteCategory(Category category) {
		categoryRepository.delete(category);
	}

}
