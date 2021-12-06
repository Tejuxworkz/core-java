package com.xworkz.collectionapp.hospital;

import com.xworkz.collectionapp.hospital.dto.Hospital;

public class FindHospital {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Hospital hospital = new Hospital();
		hospital.setName("Bowring Hospital");
		hospital.setLocation("ShivajiNagar");
		hospital.setMobileNo(8025591325l);
		
		Object obj=hospital.clone();
		Hospital hp1 = (Hospital)obj;
		System.out.println(hp1.toString());
	}
}
