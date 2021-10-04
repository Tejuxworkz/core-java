class MeafeeUtil{

	public static void main(String a[]){
	
	Meafee mf = new Meafee();
		mf.employName = "Rakshitha";
		mf.companyName = "Meafee-Company";
		mf.location = "Chennai";
		mf.displayDetails();
		
	String mfpro = mf.provideServices();
	System.out.println(mfpro);
	}
}