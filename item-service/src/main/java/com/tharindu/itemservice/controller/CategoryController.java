package com.tharindu.itemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tharindu.itemservice.modal.Category;
import com.tharindu.itemservice.service.CategoryService;

@RestController
@RequestMapping(value="category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value="category",method = RequestMethod.POST)
	public Category save(@RequestBody Category category) {
		return categoryService.save(category);	
	}
	
	@RequestMapping(value="category",method = RequestMethod.GET)
	public List<Category> fetchAllCategory(){
		return categoryService.fetchAllCategory();
		
	}

}
