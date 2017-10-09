package com.grisel.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Items")
public class Item {
	@Id
	private String id;
	@Indexed(direction = IndexDirection.DESCENDING)
	private String name;
	private double chapterNumber;
	
	public Item() {
		super();
	}
	
	public Item(String name, int chapterNumber) {
		super();
		this.name = name;
		this.chapterNumber = chapterNumber;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getChapterNumber() {
		return chapterNumber;
	}
	public void setChapterNumber(double chapterNumber) {
		this.chapterNumber = chapterNumber;
	}
	
	
	
}
