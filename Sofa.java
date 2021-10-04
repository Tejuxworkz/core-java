class Sofa{

	public String brandName;
	public String color;
	public double price;


	public Sofa(String brandName,String color,double price){
		
	System.out.println("Soft Object is created");
	
		this.brandName=brandName;
		this.color=color;
		this.price=price;	
	}
	
	public void toEnjoy(){
		System.out.println("Enjoying");
	}
	
	public void display(){
		System.out.println(brandName+" "+color+" "+price);
	}
	
	public static void main(String a[]){
	
	Sofa sofa1=new Sofa("Kurl_On","Reddish",9000.00);
	Sofa sofa2=new Sofa("Sleep_well","Greenish",7000.00);
		
	sofa1.display();
	sofa2.display();
	
	sofa1.toEnjoy();
	
	}

}