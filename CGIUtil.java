class CGIUtil{

	public static void main(String a[]){
	
		CGI cgi = new CGI();
			cgi.employName = "Gayathri";
			cgi.companyName = "CGI";
			cgi.location = "Hyderbad";
			cgi.displayDetails();
		
		String cgipro = cgi.provideServices();
		System.out.println(cgipro);
	}
}