class IntelUtil{

	public static void main(String a[]){
	
	Intel intel = new Intel();
		intel.employName = "Soundarya";
		intel.companyName = "INTEL";
		intel.location = "Bangalore";
		intel.displayDetails();
		
	String intelpro = intel.provideServices();
	System.out.println(intelpro);
	}
}