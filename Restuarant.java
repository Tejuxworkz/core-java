class Restuarant{

	public int restuarantId;
	public String restuarantName;
	public String type;
	public String location;
	public String ownerName;
	
	
	public Restuarant(){
	
		System.out.println("Restuarent object is created");
	}
	
	
	public void serveFood(){
	
		System.out.println("Serving food is very delicious");
	}

	public void displayRestuarantDetails(){
		System.out.println(restuarantId+" "+restuarantName+" "+ownerName+" "+type+" "+location);
	}


}