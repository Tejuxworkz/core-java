class GasCylinder{

	public String cyName;
	public String color;
	public double weight;
	public int price;
	
	public GasCylinder(String cyName,String color,double weight,int price){
	
		System.out.println("Gas Object created");
			
			this.cyName=cyName;
			this.color=color;
			this.weight=weight;
			this.price=price;
			
	}
	
	public void toDelivery(){
		System.out.println("Successfully Delieverd");
	}
	
	
	public void toDisplayTheDetails(){
		System.out.println(cyName+" "+color+" "+weight+" "+price);
	}
	
	public static void main(String a[]){
	
	System.out.println();
	GasCylinder gascy1=new GasCylinder("Indian","Red",14.5,850);
	GasCylinder gascy2=new GasCylinder("HP","Navy_Blue",17.6,950);
	
	System.out.println();
	gascy1.toDisplayTheDetails();
	gascy2.toDisplayTheDetails();
	
	System.out.println();
	gascy1.toDelivery();
	}
}