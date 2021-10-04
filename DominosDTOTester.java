class DominosDTOTester{

	public static void main(String a[]){
	
		DominosDTO ddto = new DominosDTO();
		
			ddto.setId(123);
			ddto.setLocation("RajajiNagar");
			ddto.setItem("Veg Pizza");
		
		System.out.println(ddto.getId()+" "+ddto.getLocation()+" "+ddto.getItem());
		
		System.out.println();
		
		DominosDTO ddto1 = new DominosDTO();
		
			ddto1.setId(234);
			ddto1.setLocation("Malleshwaram");
			ddto1.setItem("Veg Burger");
		
		System.out.println(ddto1.getId()+" "+ddto1.getLocation()+" "+ddto1.getItem());
	}
}