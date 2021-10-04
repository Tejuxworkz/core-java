class Museum{

	String museumName;
	int entryFee;
	String location;
	String typeOfMuseum[]=new String[3];;
	
	public Museum(){
	
		this("Government Museum",20,"SampangiRamaNagar");
		System.out.println("Museum Object is created");
	
	}
	
	public Museum(String museumName,int entryFee,String location){
		
		this.museumName=museumName;
		this.entryFee=entryFee;
		this.location=location;
		this.typeOfMuseum=typeOfMuseum;
		
	}
	
	public void toDisplayDetails(){
	
		System.out.println(this.museumName+" "+this.entryFee+" "+this.location);
	}

	public void getTypesOfMuseum(){
		
		for(int i=0;i<typeOfMuseum.length;i++)
		{
			System.out.println(typeOfMuseum[i]);
		}
	}



}
