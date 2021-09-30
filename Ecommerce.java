class Ecommerce{

	String name[]={"Myntra","Quikr","Olx"};
	String type;
	
	public Ecommerce(){
	
		this("Business-to-consumer");
		System.out.println("Ecommerce Object is created");
	
	}
	
	public Ecommerce(String type){
		
		this.name=name;
		this.type=type;
		
	}
	
	public void toDisplayDetails(){
	
		System.out.println(type);
	}

	public void getTypesOfMuseum(){
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}



}