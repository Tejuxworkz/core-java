package com.xworkz.collectionapp.travels;

import com.xworkz.collectionapp.travels.dto.Travel;

public class TravelBook {

	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Travel travel = new Travel();
	travel.setName("RR Travels");
	travel.setLocation("Nagadevanahalli");
	travel.setContactNo(8028486955l);
	travel.setServices("Bus");
	travel.setTiming("9.30am-8pm");
	
	Object ob = travel.clone();
	Travel tr1 = (Travel)ob;
	System.out.println(tr1.toString());
	}
}
