class CurrencyTester{

	public static void main(String a[]){
	
	CurrencyDto dto = new CurrencyDto();
		dto.setCountry("India");
		dto.setCurrency("Indian Rupee");
	
	CurrencyDto dto1 = new CurrencyDto();
		dto1.setCountry("Japan");
		dto1.setCurrency("Japanese Yen");
		
	CurrencyDto dto2 = new CurrencyDto();
		dto2.setCountry("Panama");
		dto2.setCurrency("USD");
		
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	}

}