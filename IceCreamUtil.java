class IceCreamUtil{

	public static void main(String a[]){
	
	IceCream cc1=new IceCream();
	
	cc1.iceCreamFlavour="StrawBerry";
	cc1.price=10;
	
	System.out.println(cc1.iceCreamFlavour+" "+cc1.price);
	cc1.eat();
	System.out.println();
	
	IceCream cc2=new IceCream();
	
	cc2.iceCreamFlavour="ButterScotch";
	cc2.price=15;
	
	System.out.println(cc2.iceCreamFlavour+" "+cc2.price);
	cc2.eat();
	System.out.println();

	IceCream cc3=new IceCream();
	
	cc3.iceCreamFlavour="Vanilla";
	cc3.price=10;
	
	System.out.println(cc3.iceCreamFlavour+" "+cc3.price);
	cc3.eat();

	}


}