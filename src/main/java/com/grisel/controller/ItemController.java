package com.grisel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grisel.entity.Item;
import com.grisel.repository.ItemRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/items")
public class ItemController {
	private ItemRepository itemRepo;

	public ItemController(ItemRepository itemRepo) {
		super();
		this.itemRepo = itemRepo;
	}
	
	@GetMapping
	public String getAll(){
		List<Item> items = (List<Item>) this.itemRepo.findAll();
		
		return items.toString();
	}
	
	@PostMapping
	public void saveOrUpdate(@RequestBody Item item) {
		this.itemRepo.save(item);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.itemRepo.delete(id);
	}
}
