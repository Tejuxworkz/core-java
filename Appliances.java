class Appliances{

	String shopName;
	String typesOfAppliances[]={"Microwave-Oven","Refrigentor","Toaster","Blender","Coffee-Maker","Washing-Machine"};
	
	public Appliances(){
	
		this("Bhavani-Home-Appliances");
		System.out.println("Ecommerce Object is created");
	
	}
	
	public Appliances(String shopName){
		
		this.shopName=shopName;
		this.typesOfAppliances=typesOfAppliances;
		
	}
	
	public void toDisplayDetails(){
	
		System.out.println(this.shopName);
	}

	public void getTypesOfAppliances(){
		
		for(int i=0;i<typesOfAppliances.length;i++)
		{
			System.out.println(typesOfAppliances[i]);
		}
	}



}