class MicrosoftUtil{

	public static void main(String a[]){
	
	Microsoft micro = new Microsoft();
		micro.employName = "Bhavani";
		micro.companyName = "MicroSoft";
		micro.location = "Chennai";
		micro.displayDetails();
		
	String micropro = micro.provideServices();
	System.out.println(micropro);
	}
}