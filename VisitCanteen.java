package com.xworkz.collectionapp.canteen;

import com.xworkz.collectionapp.canteen.dto.Canteen;

public class VisitCanteen {

	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Canteen canteen = new Canteen();
	canteen.setName("Indira Canteen");
	canteen.setTypeOfCanteen("Government-Restuarant");
	canteen.setLocation("Uppanagar");
	canteen.setTiming("7.30-9.30am & 12.30-2.30pm & 7.30-9.30pm");
	
	//System.out.println(canteen.toString());
	
	Object obj = canteen.clone();
	Canteen cant = (Canteen)obj;
	System.out.println(cant.toString());
	} 
	
}
