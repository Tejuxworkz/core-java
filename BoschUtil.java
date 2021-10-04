class BoschUtil{

	public static void main(String a[]){
	
	Bosch bsh = new Bosch();
		bsh.employName = "Tejashwini";
		bsh.companyName = "Bosch";
		bsh.location = "Bangalore";
		bsh.displayDetails();
		
	String bshpro = bsh.provideServices();
	System.out.println(bshpro);
	}
}