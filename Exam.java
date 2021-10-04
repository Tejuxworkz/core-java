class Exam{

	public static String universityName="VTU";
	public static int fees=1350;
 
	
 
	public static void allow(String[] hallTicket){

		System.out.println("Start of allow method with HallTicket");

	if(hallTicket!=null){
		gethallTicketDetails(hallTicket);
	}

	else{
		System.out.println("No HallTicket Found");
	}

	System.out.println("End of allow method with HallTicket");
	}


	public static void allow(int fees){
	System.out.println("Start of allow method with Fees");

	if(fees>1000){
		System.out.println(fees);
	}

	else{
		System.out.println("Please pay the fees");
	}

	System.out.println("End of allow method with Fees");
	}

	public static void gethallTicketDetails(String[] hallTicket){
	for(int i=0;i<hallTicket.length;i++)
			System.out.println(hallTicket[i]);
	}
}





