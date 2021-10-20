class ContinentsTester{

	public static void main(String a[]){
	
	ContinentsDto dto = new ContinentsDto();
		
		dto.setNameOfContinent("Asia");
		dto.setNoOfCountries(48);
		dto.setPopularFor("Russia - World's Largest Country");
		
	ContinentsDto dto1 = new ContinentsDto();
		
		dto1.setNameOfContinent("Africa");
		dto1.setNoOfCountries(54);
		dto1.setPopularFor("Ethiopia - World's Hottest Place");
		
	ContinentsDto dto2 = new ContinentsDto();
		
		dto2.setNameOfContinent("Australia");
		dto2.setNoOfCountries(3);
		dto2.setPopularFor("Kangroo,Emu,Platypus - Unique Animals");
		
	ContinentsDto dto3 = new ContinentsDto();
		dto3.setNameOfContinent("Europe");
		dto3.setNoOfCountries(50);
		dto3.setPopularFor("Vatican - World's Smallest COuntry");
		
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	System.out.println(dto3);	
	}

}