package com.tharindu.itemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
