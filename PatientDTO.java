public class PatientDTO{

	public PatientDTO(){
		System.out.println("PatientDTO Object is created");
	}
	
		private long patientId;
		private String patientName;
		private String bloodGroup;
		private String address;
		private int age;
		private String gender;
		
		
		public long getPatientId(){
			return patientId;
		}

		public void setPatientId(long patientId){
			this.patientId=patientId;
		}
		

		public String getPatientName(){
			return patientName;
		}

		public void setPatientName(String patientName){
			this.patientName=patientName;
		}
		
		
		public String getBloodGroup(){
			return bloodGroup;
		}

		public void setBloodGroup(String bloodGroup){
			this.bloodGroup=bloodGroup;
		}
		
		
		public String getAddress(){
			return address;
		}

		public void setAddress(String address){
			this.address=address;
		}
		
		
		public int getAge(){
			return age;
		}

		public void setAge(int age){
			this.age=age;
		}
		
		
		public String getGender(){
			return gender;
		}

		public void setGender(String gender){
			this.gender=gender;
		}
} 