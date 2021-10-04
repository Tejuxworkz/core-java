class HPEUtil{

	public static void main(String a[]){
	
	HPE hpe = new HPE();
		hpe.employName = "Uday";
		hpe.companyName = "HPE-Technology";
		hpe.location = "Pune";
		hpe.displayDetails();
		
	String hpepro = hpe.provideServices();
	System.out.println(hpepro);
	}
}