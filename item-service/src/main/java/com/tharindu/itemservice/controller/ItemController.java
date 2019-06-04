package com.tharindu.itemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tharindu.itemservice.modal.Item;
import com.tharindu.itemservice.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping(value="item")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@RequestMapping(value="item" , method = RequestMethod.POST)
	public Item save(@RequestBody Item item){
		return itemService.save(item);	
	}
	
	@RequestMapping(value="item",method = RequestMethod.GET)
	public List<Item> fetchAllItems(){
		return itemService.fetchAllItems();
	}
	
	@RequestMapping(value="item/{id}",method = RequestMethod.GET)
	public ResponseEntity<Item> fetchCategory(@PathVariable Long id){
			if(itemService.fetchItem(id)!=null) {
				return ResponseEntity.ok(itemService.fetchItem(id));
			}
			else {
				return ResponseEntity.notFound().build();
			}
	}
	
	@RequestMapping(value="item",method = RequestMethod.PUT)
	public ResponseEntity<Item> updateCategory(@RequestBody Item item){
			if(itemService.updateItem(item)!=null) {
				return ResponseEntity.ok(itemService.updateItem(item));
			}
			else {
				return ResponseEntity.notFound().build();
			}
	}
	
//	@RequestMapping(value="item/{id}",method = RequestMethod.DELETE)
	 @DeleteMapping("item/{id}")
	void deleteCategory(@PathVariable("id") Long id) {
		itemService.deleteItem(id);
	}
}
