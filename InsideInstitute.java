package com.xworkz.collectionapp.institute;

import com.xworkz.collectionapp.institute.dto.Institute;

public class InsideInstitute {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Institute ins = new Institute();
		ins.setName("X-workz ODC");
		ins.setLocation("RajajiNagar");
		ins.setOwner("Omkar");
		ins.setNoOfStudents(200);
		ins.setFees(25000);
		
		Object ob = ins.clone();
		Institute in = (Institute)ob;
		System.out.println(in.toString());
	}
}
