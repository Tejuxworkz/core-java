class BallyUtil{

	public static void main(String a[]){
	
	Bally bally = new Bally();
		bally.employName = "Anusha";
		bally.companyName = "Bally-Company";
		bally.location = "Bangalore";
		bally.displayDetails();
		
	String ballypro = bally.provideServices();
	System.out.println(ballypro);
	}
}