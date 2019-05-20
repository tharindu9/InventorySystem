package com.tharindu.itemservice.service;

import java.util.List;

import com.tharindu.itemservice.modal.Item;

public interface ItemService {

	Item save(Item item);
	List<Item> fetchAllItems();
	Item fetchItem(Long id);
	Item updateItem(Item item);
	void deleteItem(Item item);
}
