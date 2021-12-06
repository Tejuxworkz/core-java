package com.xworkz.collectionapp.showroom;

import com.xworkz.collectionapp.showroom.dto.Showroom;

public class ShowroomView {
 
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Showroom sr=new Showroom();
	
	sr.setName("Glima Showroom");
	sr.setLocation("GnanaBharti-Bangalore");
	sr.setContactNo(9845682289l);
	sr.setTiming("9am-9pm");
	
	Object ob = sr.clone();
	Showroom sr1=(Showroom)ob;
	System.out.println(sr1.toString());
	}
}
