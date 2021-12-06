package com.xworkz.collectionapp.stadium.dto;

public class Stadium implements Cloneable {
		
		private String stadiumName;
		private String location;
		private String owner;
		private long capacity;
		private int establishment;
		
		public String getStadiumName() {
			return stadiumName;
		}

		public void setStadiumName(String stadiumName) {
			this.stadiumName = stadiumName;
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

		public long getCapacity() {
			return capacity;
		}

		public void setCapacity(long capacity) {
			this.capacity = capacity;
		}

		public int getEstablishment() {
			return establishment;
		}

		public void setEstablishment(int establishment) {
			this.establishment = establishment;
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
				return super.clone();
		}
		
		@Override
		public String toString() {
		return "Stadium- [StadiumName:"+this.stadiumName+", Location:"+this.location+", Owner: "+this.owner+", Capacity: "+this.capacity+", Establishment: "+this.establishment+"]";
		}
		
}
