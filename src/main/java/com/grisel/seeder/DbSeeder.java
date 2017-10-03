package com.grisel.seeder;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.grisel.entity.Item;
import com.grisel.repository.ItemRepository;

@Component
public class DbSeeder implements CommandLineRunner {
	private ItemRepository itemRepo;

	public DbSeeder(ItemRepository itemRepo) {
		super();
		this.itemRepo = itemRepo;
	}

	@Override
	public void run(String... arg0) throws Exception {
		Item BokuNoHeroAcademia = new Item("Boku No Hero Academia", 153);
		Item WuDongKianKung = new Item("Wu Dong Kian Kung", 56);
		
		//Drop all items
		this.itemRepo.deleteAll();
		
		List<Item> itemList = Arrays.asList(BokuNoHeroAcademia, WuDongKianKung);
		
		this.itemRepo.save(itemList);
		
	}

}
