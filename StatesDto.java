class StatesDto{

	private int serialNo;
	private String nameOfState;
	private String nameOfCapital;
	
	public StatesDto(){
	System.out.println("States Objects is created");
	}
	
	public void setSerialNo(int serialNo){
	this.serialNo=serialNo;
	}
	
	public void setNameOfState(String nameOfState){
	this.nameOfState=nameOfState;
	}
	
	public void setNameOfCapital(String nameOfCapital){
	this.nameOfCapital=nameOfCapital;
	}
	
	@Override
	public String toString(){
	return "StatesDto - [ serialNo= " +this.serialNo+", nameOfState= " +this.nameOfState+", nameOfCapital= " +this.nameOfCapital+"]";
	}
	
}