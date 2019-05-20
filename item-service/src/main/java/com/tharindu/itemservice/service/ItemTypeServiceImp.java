package com.tharindu.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharindu.itemservice.modal.Category;
import com.tharindu.itemservice.modal.ItemType;
import com.tharindu.itemservice.repository.ItemRepository;
import com.tharindu.itemservice.repository.TypeRepository;

@Service
public class ItemTypeServiceImp implements ItemTypeService {
	
	@Autowired
	TypeRepository typeRepository;
	
	@Override
	public ItemType save(ItemType type){
		return typeRepository.save(type);	
	}
	
	@Override
	public List<ItemType> fetchAllItems(){
		return typeRepository.findAll();
	}
	
	@Override
	public ItemType fetchItem(Integer id){
		Optional<ItemType> opItemType = typeRepository.findById(id);
		if(opItemType.isPresent()) {
			return opItemType.get();
		}
		else {
			return null;
		}
	}
	
	@Override
	public ItemType updateItemType(ItemType itemType){
		Integer id = itemType.getId();
		Optional<ItemType> opCategory = typeRepository.findById(id);
		if(opCategory.isPresent()) {
				 return typeRepository.save(itemType);
		}
		else {
			return null;
		}
	}
	
	@Override
	public void deleteItemType(ItemType itemType) {
		typeRepository.delete(itemType);
	}
	
//	@Autowired 
//	ItemRepository itemRepository;
//	public List<ItemType> findByCategoryId(ItemType itemType){
//		
//		Integer id = itemType.getId();
//		return typeRepository.findAllById(id);
//	}

}
