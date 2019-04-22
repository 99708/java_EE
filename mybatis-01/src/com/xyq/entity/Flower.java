package com.xyq.entity;

public class Flower {
	private Integer id;
	private String name;
	private double price;
	private String production;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public Flower(Integer id, String name, double price, String production) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.production = production;
	}
	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name + ", price=" + price + ", production=" + production + "]";
	}
	public Flower() {
		super();
	}
	
	
}
