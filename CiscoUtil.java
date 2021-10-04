class CiscoUtil{

	public static void main(String a[]){
	
	Cisco cis = new Cisco();
		cis.employName = "Somasekhar";
		cis.companyName = "CISCO";
		cis.location = "Chennai";
		cis.displayDetails();
		
	String cispro = cis.provideServices();
	System.out.println(cispro);
	}
}