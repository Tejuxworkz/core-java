class Parliament{

	public String partyName;
	public int noOfMembers;
	
	public Parliament(String pName,int noMembs){
		partyName=pName;
		noOfMembers=noMembs;
	System.out.println("Object created");
	}

	public void showPartyDetails(){
	System.out.println("Party Members ");
	}

	public void displayTheDetails(){
		System.out.println(partyName+" "+noOfMembers);
	}


}