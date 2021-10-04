class TescoUtil{

	public static void main(String a[]){
	
	Tesco tes = new Tesco();
		tes.employName = "Meghana";
		tes.companyName = "TESCO";
		tes.location = "Pune";
		tes.displayDetails();
		
	String tespro = tes.provideServices();
	System.out.println(tespro);
	}
}