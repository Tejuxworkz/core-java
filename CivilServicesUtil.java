class CivilServicesUtil{

	public static void main(String a[]){
	
	CivilServicesDto dto = new CivilServicesDto();
		dto.setTypeOfServices("All India Services");
		dto.setDurationForExam("2hrs");
		dto.setAcronym("UPSC CSPE");
	
	CivilServicesDto dto1 = new CivilServicesDto();
		dto1.setTypeOfServices("CentralServices(GroupA)");
		dto1.setDurationForExam("3hrs");
		dto1.setAcronym("UPSC CSME");
		
	CivilServicesDto dto2 = new CivilServicesDto();
		dto2.setTypeOfServices("CentralServices(GroupB)");
		dto2.setDurationForExam("2hrs");
		dto2.setAcronym("UPSC CSE");
		
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	}
}