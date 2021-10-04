class MusicalInstrumentsConstructor{

	public String name;
	public double price;
	public String frequency;
	public String type;
	
	public MusicalInstrumentsConstructor(String nm,double pri,String freq,String type1){
		name=nm;
		price=pri;
		frequency=freq;
		type=type1;
	System.out.println("Musical Instrument object is created");
	}
	
	public void play(String name){
	System.out.println("invoked the playMethod");
	System.out.println("Playing"+" "+name+" "+"with friends");
	System.out.println("end of playMethod");
	}

}