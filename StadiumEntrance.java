package com.xworkz.collectionapp.stadium;

import com.xworkz.collectionapp.stadium.dto.Stadium;

class StadiumEntrance{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Stadium std = new Stadium();
		std.setStadiumName("M.ChinnaSwamy Stadium");
		std.setEstablishment(1969);
		std.setOwner("Government of Karnataka");
		std.setLocation("Bangalore-Karnataka");
		std.setCapacity(40000);
		
		Object obj = std.clone();
		Stadium std1 = (Stadium)obj;
		System.out.println(std1.toString());
	}
}