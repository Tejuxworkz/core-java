package com.xworkz.collectionapp.mobiles.dto;

public class Mobile implements Cloneable {
	
	private String brand;
	private String series;
	private String storage;
	private String screenSize;
	private float price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Mobile- [Brand: "+this.brand+", Series: "+this.series+", Storage: "+this.storage+", ScreenSize: "+this.screenSize+", Price: "+this.price+"]";
	}
	
}
