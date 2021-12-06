package com.xworkz.collectionapp.hospital.dto;

public class Hospital implements Cloneable {
	
	private String name;
	private String location;
	private long mobileNo;
	private String availablity;
	
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAvailablity() {
		return availablity;
	}
	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Hospital- [Name: "+this.name+", Location: "+this.location+", MobileNo: "+this.mobileNo+", Available:"+this.availablity+"]";
	}
}
