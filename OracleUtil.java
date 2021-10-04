class OracleUtil{

	public static void main(String a[]){
	
	Oracle orc = new Oracle();
		orc.employName = "Bhavani";
		orc.companyName = "Oracle";
		orc.location = "Hyderbad";
		orc.displayDetails();
		
	String orcpro = orc.provideServices();
	System.out.println(orcpro);
	}
}