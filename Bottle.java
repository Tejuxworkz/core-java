package com.xworkz.collectionapp.bottle.dto;

public class Bottle implements Cloneable {

	private String brandName;
	private String material;
	private String capacity;
	private String color;
	private double cost;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double d) {
		this.cost = d;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Bootle - [BrandName: "+this.brandName+", Material: "+this.material+", Capacity: "+this.capacity+", Color: "+this.color+", Cost: "+this.cost+"]";
	}
	
}
