class GodDto{

	private String godName;
	private String location;
	private String state;
	
	public GodDto(){
	System.out.println("God object is created");
	}
	
	public void setGodName(String godName){
	this.godName=godName;
	}
	
	public void setLocation(String location){
	this.location=location;
	}
	
	public void setState(String state){
	this.state=state;
	}
	
	@Override
	public String toString(){
	return "GodDto -[godName= "+ this.godName+", location= "+this.location+", state= "+this.state+"]";
	}
}