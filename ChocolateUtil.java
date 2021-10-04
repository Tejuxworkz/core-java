class ChocolateUtil{

	public static void main(String a[]){
	
	Chocolate ch1=new Chocolate();
	
	ch1.choloateName="5-Star";
	ch1.price=5;
	
	System.out.println(ch1.choloateName+" "+ch1.price);
	ch1.eat();
	System.out.println();
	
	Chocolate ch2=new Chocolate();
	
	ch2.choloateName="Kit-Kat";
	ch2.price=10;
	
	System.out.println(ch2.choloateName+" "+ch2.price);
	ch2.eat();
	System.out.println();

	Chocolate ch3=new Chocolate();
	
	ch3.choloateName="Diary_Milk";
	ch3.price=20;
	
	System.out.println(ch3.choloateName+" "+ch3.price);
	ch3.eat();

	}


}