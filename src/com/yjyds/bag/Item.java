package com.yjyds.bag;

/**
 * ×Ü³ÌÐòCH1-2
 * @author Administrator
 *
 */

public class Item {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	private Integer price;
	
	public Item(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
}