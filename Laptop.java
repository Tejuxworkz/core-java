package com.xworkz.collectionapp.laptop.dto;

public class Laptop implements Cloneable {
	
	private String brand;
	private String name;
	private String processor;
	private String cache;
	private double price;
	private int noOfCores;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
			return super.clone();
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getCache() {
		return cache;
	}
	public void setCache(String cache) {
		this.cache = cache;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public int getNoOfCores() {
		return noOfCores;
	}
	public void setNoOfCores(int core) {
		this.noOfCores = core;
	}
	
	@Override
	public String toString() {
		return "Laptop- [Brand: "+this.brand+" Name: "+this.name+" Process: "+this.processor+" Cache: "+this.cache+" Price: "+this.price+" NoOfCores"+this.noOfCores+"]";
	}
}
