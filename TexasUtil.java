class TexasUtil{

	public static void main(String a[]){
	
	Texas tex = new Texas();
		tex.employName = "Suchitha";
		tex.companyName = "Texas";
		tex.location = "Bangalore";
		tex.displayDetails();
		
	String texpro = tex.provideServices();
	System.out.println(texpro);
	}
}