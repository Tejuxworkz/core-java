class PatientDTOUtil{

	public static void main(String a[]){
	
		PatientDTO dto = new PatientDTO();
		
			dto.setPatientId(519345);//setter initialization
			dto.setPatientName("Teju");
			dto.setBloodGroup("B+");
			dto.setAddress("Kengeri");
			dto.setAge(21);
			dto.setGender("Female");			
			
		System.out.println(dto.getPatientId()+" "+dto.getPatientName()+" "+dto.getGender()+" "+dto.getBloodGroup()+" "+dto.getAddress()+" "+dto.getAge());
	
	
	}



}