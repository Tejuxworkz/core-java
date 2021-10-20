class StatesTester{

	public static void main(String c[]){
	
	StatesDto dto = new StatesDto();
		dto.setSerialNo(1);
		dto.setNameOfState("Andhra Pradesh");
		dto.setNameOfCapital("Hyderabad");
		
	StatesDto dto1 = new StatesDto();
		dto1.setSerialNo(4);
		dto1.setNameOfState("Bihar");
		dto1.setNameOfCapital("Patna");
		
	StatesDto dto2 = new StatesDto();
		dto2.setSerialNo(4);
		dto2.setNameOfState("Chattisgarh");
		dto2.setNameOfCapital("Raipur");
		
	StatesDto dto3 = new StatesDto();
		dto3.setSerialNo(5);
		dto3.setNameOfState("Gujarat");
		dto3.setNameOfCapital("GandhiNagar");
		
	StatesDto dto4 = new StatesDto();
		dto4.setSerialNo(7);
		dto4.setNameOfState("Himachal Pradesh");
		dto4.setNameOfCapital("Shimla");
		
	StatesDto dto5 = new StatesDto();
		dto5.setSerialNo(9);
		dto5.setNameOfState("Kerala");
		dto5.setNameOfCapital("ThiruvananathPuram");
		
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	System.out.println(dto3);
	System.out.println(dto4);
	System.out.println(dto5);
	}
}