package com.xworkz.collectionapp.bottle;

import com.xworkz.collectionapp.bottle.dto.Bottle;

public class BottleOpens {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Bottle bottle = new Bottle();
		bottle.setBrandName("Bisleri");
		bottle.setCapacity("500ml");
		bottle.setColor("Aqua");
		bottle.setMaterial("Plastic");
		bottle.setCost(200.00);
		
		Object ob= bottle.clone();
		Bottle bottle1 = (Bottle)ob;
		System.out.println(bottle1.toString());
	}
}
