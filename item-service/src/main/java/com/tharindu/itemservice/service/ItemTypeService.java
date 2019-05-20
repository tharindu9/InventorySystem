package com.tharindu.itemservice.service;

import java.util.List;

import com.tharindu.itemservice.modal.ItemType;

public interface ItemTypeService {

	ItemType save(ItemType type);
	List<ItemType> fetchAllItems();
	ItemType fetchItem(Integer id);
	ItemType updateItemType(ItemType itemType);
	void deleteItemType(ItemType itemType);
}
