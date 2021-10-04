class RestuarantTester{
 
	public static void main(String[] a){
		
		System.out.println();
		Restuarant rest = new Restuarant();
		
		rest.restuarantId=1947;
		rest.restuarantName="Polas";
		rest.type="Veg";
		rest.location="Sudha_Cross";
		rest.ownerName="Abc";
		rest.displayRestuarantDetails();
		System.out.println();
			
		Restuarant rest1 = new Restuarant();
		
		rest1.restuarantId=1999;
		rest1.restuarantName="Empire";
		rest1.type="Non-Veg";
		rest1.location="Kormangala";
		rest1.ownerName="Sanjana";
		rest1.displayRestuarantDetails();
		System.out.println();
		
		Restuarant rest2 = new Restuarant();
		
		rest2.restuarantId=2022;
		rest2.restuarantName="MRSBUNTS";
		rest2.type="Veg & Non-Veg";
		rest2.location="India";
		rest2.ownerName="MrsBunts";
		rest2.displayRestuarantDetails();
		
		System.out.println();
		rest2.serveFood();
		
		
		
	}



}