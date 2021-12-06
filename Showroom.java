package com.xworkz.collectionapp.showroom.dto;

public class Showroom implements Cloneable{

	private String name;
	private String location;
	private long contactNo;
	private String timing;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
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
		return "Showroom- [Name: "+this.name+", Location: "+this.location+", Contact: "+this.contactNo+", Timing: "+this.timing+"]";
	}
}
