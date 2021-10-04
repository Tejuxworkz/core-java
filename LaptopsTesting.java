class LaptopsTesting{

	public static void main(String[] a){
	
		Laptops lp1 = new Laptops();
	
		lp1.laptopBrand = "Lenovo";
		lp1.processorName = "Intel_Core_i3_(10th Gen)";
		lp1.screenSize="15.6_Inches";
		lp1.price=40490;
	
		System.out.println(lp1.laptopBrand+" "+lp1.processorName+" "+lp1.screenSize+" "+lp1.price);
		lp1.displayScreen();
		System.out.println();
		
		
		Laptops lp2 = new Laptops();
	
		lp2.laptopBrand = "Dell";
		lp2.processorName = "Intel_Core_i3 _(11th Gen)";
		lp2.screenSize="15.6_Inches";
		lp2.price=39799;
	
		System.out.println(lp2.laptopBrand+" "+lp2.processorName+" "+lp2.screenSize+" "+lp2.price);
		lp2.displayScreen();
		System.out.println();
		
		Laptops lp3 = new Laptops();
	
		lp3.laptopBrand = "Apple_MacBook";
		lp3.processorName = "Intel_Core_i5 _(10th Gen)";
		lp3.screenSize="13.3_Inches";
		lp3.price=112990;
	
		System.out.println(lp3.laptopBrand+" "+lp3.processorName+" "+lp3.screenSize+" "+lp3.price);
		lp3.displayScreen();
	}
}