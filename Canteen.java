package com.xworkz.collectionapp.canteen.dto;

public class Canteen implements Cloneable{

	private String name;
	private String typeOfCanteen;
	private String location;
	private String timing;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeOfCanteen() {
		return typeOfCanteen;
	}
	public void setTypeOfCanteen(String typeOfCanteen) {
		this.typeOfCanteen = typeOfCanteen;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Canteen- [Name: "+this.name+", Type: "+this.typeOfCanteen+", Location: "+this.location+", Timing: "+this.timing+"]";
	}
}
