package com.xworkz.collectionapp.laptop;

import com.xworkz.collectionapp.laptop.dto.Laptop;

public class StartTheLaptop {

	public static void main(String[] args) throws CloneNotSupportedException {
		Laptop laptop = new Laptop();
		laptop.setBrand("HP");
		laptop.setName("Chromebook 14a-na0003tu");
		laptop.setProcessor("IntelCeleron");
		laptop.setCache("4MB");
		laptop.setNoOfCores(2);
		laptop.setPrice(28999.00);
		
		Object obj = laptop.clone();
		Laptop laptop1 = (Laptop)obj;
		System.out.println(laptop1.toString());
	}
}
