package com.tharindu.itemservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharindu.itemservice.modal.Category;
import com.tharindu.itemservice.modal.ItemType;
import com.tharindu.itemservice.repository.TypeRepository;

@Service
public class ItemTypeServiceImp implements ItemTypeService {
	
	@Autowired
	TypeRepository typeRepository;
	
	@Override
	public ItemType save(ItemType type){
		
		Category category = type.getCategory();
		type.setCategory(category);
			
		return typeRepository.save(type);	
	}

}
