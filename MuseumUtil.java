class MuseumUtil{

	public static void main(String a[]){
	
	Museum m = new Museum();
	
	m.typeOfMuseum[0] = "Art-Museum";
	m.typeOfMuseum[1] = "Open-Air-Museum";
	m.typeOfMuseum[2] = "Science-Museum";
	
	System.out.println();
	m.toDisplayDetails();
	m.getTypesOfMuseum();
	
	}

}