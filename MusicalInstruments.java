class MusicalInstruments{

	public String name;
	public double price;
	public String frequency;
	public String type;
	
	public MusicalInstruments(){
	System.out.println("Musical Instrument object is created");
	}
	
	public void play(String name){
	System.out.println("invoked the playMethod");
	System.out.println("Playing"+" "+name+" "+"with friends");
	System.out.println("end of playMethod");
	}

}