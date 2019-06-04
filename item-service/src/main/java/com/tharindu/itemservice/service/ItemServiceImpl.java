package com.tharindu.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharindu.itemservice.modal.Item;
import com.tharindu.itemservice.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public Item save(Item item){
		return itemRepository.save(item);	
	}
	
	@Override
	public List<Item> fetchAllItems(){
		return itemRepository.findAll();
	}
	
	@Override
	public Item fetchItem(Long id){
		Optional<Item> opItemType = itemRepository.findById(id);
		if(opItemType.isPresent()) {
			return opItemType.get();
		}
		else {
			return null;
		}
	}
	
	@Override
	public Item updateItem(Item item){
		Long id = item.getId();
		Optional<Item> opCategory = itemRepository.findById(id);
		if(opCategory.isPresent()) {
				 return itemRepository.save(item);
		}
		else {
			return null;
		}
	}
	
	@Override
	public void deleteItem(Long id) {
		itemRepository.deleteById(id);
	}

	

}
