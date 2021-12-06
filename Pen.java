package com.xworkz.collectionapp.pens.dto;

public class Pen implements Cloneable {
	
	private String brand;
	private String color;
	private String typeOfPen;
	private String Material;
	private float price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTypeOfPen() {
		return typeOfPen;
	}
	public void setTypeOfPen(String typeOfPen) {
		this.typeOfPen = typeOfPen;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
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
		return "Pen- [Brand: "+this.brand+", Color: "+this.color+", Type: "+this.typeOfPen+", Material: "+this.Material+", Price: "+this.price+"]";
	}
}