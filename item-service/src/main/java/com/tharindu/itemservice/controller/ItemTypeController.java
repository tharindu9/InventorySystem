package com.tharindu.itemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tharindu.itemservice.modal.Category;
import com.tharindu.itemservice.modal.ItemType;
import com.tharindu.itemservice.service.ItemTypeService;

@RestController
@RequestMapping(value="itemTypes")
public class ItemTypeController {

	@Autowired
	ItemTypeService itemTypeService;
	
	@RequestMapping(value="itemTypes" , method = RequestMethod.POST)
	public ItemType save(@RequestBody ItemType type){
		return itemTypeService.save(type);	
	}
	
	@RequestMapping(value="itemTypes",method = RequestMethod.GET)
	public List<ItemType> fetchAllItems(){
		return itemTypeService.fetchAllItems();
	}
	
	@RequestMapping(value="itemTypes/{id}",method = RequestMethod.GET)
	public ResponseEntity<ItemType> fetchCategory(@PathVariable Integer id){
			if(itemTypeService.fetchItem(id)!=null) {
				return ResponseEntity.ok(itemTypeService.fetchItem(id));
			}
			else {
				return ResponseEntity.notFound().build();
			}
	}
	
	@RequestMapping(value="itemTypes",method = RequestMethod.PUT)
	public ResponseEntity<ItemType> updateCategory(@RequestBody ItemType itemType){
			if(itemTypeService.updateItemType(itemType)!=null) {
				return ResponseEntity.ok(itemTypeService.updateItemType(itemType));
			}
			else {
				return ResponseEntity.notFound().build();
			}
	}
	
	@RequestMapping(value="itemTypes",method = RequestMethod.DELETE)
	void deleteCategory(@RequestBody ItemType itemType) {
		itemTypeService.deleteItemType(itemType);
	}
}
