package com.xworkz.collectionapp.travels.dto;

public class Travel implements Cloneable{

	private String name;
	private String location;
	private String timing;
	private long contactNo;
	private String services;
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
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Travel- [Name: "+this.name+", Location: "+this.location+", Timing: "+this.timing+", Contact: "+this.contactNo+", Service: "+this.services+"]";
	}
}
