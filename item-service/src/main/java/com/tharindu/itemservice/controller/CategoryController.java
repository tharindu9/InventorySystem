package com.tharindu.itemservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.tharindu.itemservice.modal.Category;
import com.tharindu.itemservice.modal.ItemType;
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
	
//	@RequestMapping(value="allcategory",method = RequestMethod.GET)
//	public String fetchAllCategory(Model model){
//		model.addAttribute("allCategory",categoryService.fetchAllCategory());
//		return "category";
//		
//	}
//	
	@RequestMapping(value="category/{id}",method = RequestMethod.GET)
	public ResponseEntity<Category> fetchCategory(@PathVariable Integer id){
		
			if(categoryService.fetchCategory(id)!=null) {
				return ResponseEntity.ok(categoryService.fetchCategory(id));
			}
			else {
				return ResponseEntity.notFound().build();
			}
	}
	
	@RequestMapping(value="category",method = RequestMethod.PUT)
	public ResponseEntity<Category> updateCategory(@RequestBody Category category){
			if(categoryService.updateCategory(category)!=null) {
				return ResponseEntity.ok(categoryService.updateCategory(category));
			}
			else {
				return ResponseEntity.notFound().build();
			}
	}

	@RequestMapping(value="category",method = RequestMethod.DELETE)
	void deleteCategory(@RequestBody Category category) {
		 categoryService.deleteCategory(category);
	}
	
	@RequestMapping(value = "/category/{id}/itemTypes" , method = RequestMethod.GET )
	public ResponseEntity<List<List<ItemType>>> fetchCategoryTypes(@PathVariable  Integer id,@RequestParam String itemType) {
		Category cate = new Category();
		cate.setId(id);
		
		Category cate1 = categoryService.fetchCategory(id);
		List<List<ItemType>> itemTypes =null;
		itemTypes.add(cate1.getTypes());
		if(cate1!=null) {
			return ResponseEntity.ok(itemTypes);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
