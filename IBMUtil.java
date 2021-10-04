class IBMUtil{

	public static void main(String a[]){
	
	IBM ibm = new IBM();
		ibm.employName = "Ramsha";
		ibm.companyName = "IBM";
		ibm.location = "Bangalore";
		ibm.displayDetails();
		
	String ibmpro = ibm.provideServices();
	System.out.println(ibmpro);
	}
}