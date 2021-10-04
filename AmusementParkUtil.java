class AmusementParkUtil{

	public static void main(String a[]){
	
	AmusementPark park1=new AmusementPark();
	
	park1.parkName="Wonderla";
	park1.location="Mysore Road,Bangalore";
	park1.entryTicketPrice=890;
	
	System.out.println(park1.parkName+" "+park1.location+" "+park1.entryTicketPrice);
	park1.play();
	System.out.println();
	
	AmusementPark park2=new AmusementPark();
	
	park2.parkName="Fun_World";
	park2.location="JC Nagar,Bangalore";
	park2.entryTicketPrice=750;
	
	System.out.println(park2.parkName+" "+park2.location+" "+park2.entryTicketPrice);
	park2.play();
	System.out.println();

	AmusementPark park3=new AmusementPark();
	
	park3.parkName="Neeladri";
	park3.location="Hosur Road,Bangalore";
	park3.entryTicketPrice=40;
	
	System.out.println(park3.parkName+" "+park3.location+" "+park3.entryTicketPrice);
	park3.play();
	System.out.println();


}


}