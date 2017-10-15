package com.grisel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grisel.entity.Item;
import com.grisel.repository.ItemRepository;

@Controller
public class ItemController {
	
	private ItemRepository _itemRepo;
	
	
	public void saveItems(Iterable<Item> itemList){
		System.out.println("test");
		_itemRepo.save(itemList);
	}
}
