class Google{

	public String toSearch;
	public int noOfWebsites;
	
	public Google(String search,int noofwebsites){
		toSearch=search;
		noOfWebsites=noofwebsites;
	System.out.println("Object created");
	}

	public void showTheSearchDetail(){
	System.out.println("Successfully Information");
	}

	public void displayTheDetails(){
		System.out.println(toSearch+" "+noOfWebsites);
	}
}