class CivilServicesDto{

	private String typeOfServices;
	private String durationForExam;
	private String acronym;
	
	public CivilServicesDto(){
	System.out.println("CivilServicesDto object is created");
	}
	
	public void setTypeOfServices(String typeOfServices){
	this.typeOfServices=typeOfServices;
	}
	
	public void setDurationForExam(String durationForExam){
	this.durationForExam=durationForExam;
	}
	
	public void setAcronym(String acronym){
	this.acronym=acronym;
	}
	
	public String toString(){
	return "CivilServicesDto -[typeOfServices= " +this.typeOfServices+", durationForExam= " +this.durationForExam+", acronym= " +this.acronym+"]";
	}
}