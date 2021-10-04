class MphasisUtil{

	public static void main(String a[]){
	
	Mphasis mph = new Mphasis();
		mph.employName = "Nayum";
		mph.companyName = "Mphasis";
		mph.location = "Hyderbad";
		mph.displayDetails();
		
	String mphpro = mph.provideServices();
	System.out.println(mphpro);
	}
}