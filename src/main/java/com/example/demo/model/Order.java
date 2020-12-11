package com.example.demo.model;

import java.util.List;

public class Order {

	long id;
	String item;
	float price;
	List<Address> adresses;

	public Order(long id, String item, float price, List<Address> adresses) {
		this.id = id;
		this.item = item;
		this.price = price;
		this.adresses = adresses;
	}

	public Order() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Address> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}

}
