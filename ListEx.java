package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	
	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		list.add("Uppena");
		list.add("Yuvaratna");
		list.add(null);
		list.add("Varsham");
		list.add(null);
		list.add("Uppena");	
		
		list.forEach(System.out::println);
	}

}
