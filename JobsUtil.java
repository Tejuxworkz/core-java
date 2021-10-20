class JobsUtil{

	public static void main(String a[]){
	
	JobsDto dto = new JobsDto();
		dto.setTypeOfJob("PrivateJob");
		dto.setJobRole("GET");
		dto.setLocation("Bengalore");
		dto.setState("Karntaka");
		
	JobsDto dto1 = new JobsDto();
		dto1.setTypeOfJob("GovernmentJob");
		dto1.setJobRole("SET");
		dto1.setLocation("Hyderbad");
		dto1.setState("AndhraPradesh");
		
	JobsDto dto2= new JobsDto();
		dto2.setTypeOfJob("PrivateJob");
		dto2.setJobRole("TeleCaller");
		dto2.setLocation("Chennai");
		dto2.setState("TamilNadu");
		
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	}

}