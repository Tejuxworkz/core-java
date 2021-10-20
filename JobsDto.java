class JobsDto{

	private String typeOfJob;
	private String jobRole;
	private String location;
	private String state;
	
	public JobsDto(){
	System.out.println("God object is created");
	}
	
	public void setTypeOfJob(String typeOfJob){	
	this.typeOfJob=typeOfJob;
	}
	
	public void setJobRole(String jobRole){	
	this.jobRole=jobRole;
	}
	
	public void setLocation(String location){
	this.location=location;
	}
	
	public void setState(String state){
	this.state=state;
	}
	
	@Override
	public String toString(){
	return "GodDto -[typeOfJob= "+ this.typeOfJob+", jobRole= " +this.jobRole+", location= "+this.location+", state= "+this.state+"]";
	}
}