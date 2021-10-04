class SonataUtil{

	public static void main(String a[]){
	
	Sonata snt = new Sonata();
		snt.employName = "Anushri";
		snt.companyName = "Sonata";
		snt.location = "Pune";
		snt.displayDetails();
		
	String sntpro = snt.provideServices();
	System.out.println(sntpro);
	}
}