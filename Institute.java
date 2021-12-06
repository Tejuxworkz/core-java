package com.xworkz.collectionapp.institute.dto;

public class Institute implements Cloneable {
		
		private String name;
		private String location;
		private String owner;
		private int noOfStudents;
		private float fees;
		
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
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public int getNoOfStudents() {
			return noOfStudents;
		}
		public void setNoOfStudents(int noOfStudents) {
			this.noOfStudents = noOfStudents;
		}
		public float getFees() {
			return fees;
		}
		public void setFees(float fees) {
			this.fees = fees;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		@Override
		public String toString() {
			return "Institute- [Name: "+this.name+", Location: "+this.location+", Owner: "+this.owner+", NoOfStudents: "+this.noOfStudents+", Fees: "+this.fees+"]";
		}
}
