package com.xworkz.collectionapp.mobiles;

import com.xworkz.collectionapp.mobiles.dto.Mobile;

public class MobileCheck {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Mobile mobile = new Mobile();
		mobile.setBrand("OPPO");
		mobile.setSeries("A5 2020");
		mobile.setStorage("RAM-64GB & ROM-4GB");
		mobile.setScreenSize("6.5 inch");
		mobile.setPrice(16000.00f);
		
		Object obj = mobile.clone();
		Mobile mob = (Mobile)obj;
		System.out.println(mob.toString());
	}
}
