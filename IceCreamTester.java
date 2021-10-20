class IceCreamTester{

	public static void main(String a[]){
	
	IceCreamDto dto = new IceCreamDto();
		dto.setIceCreamBrand("Amul");
		dto.setIceCreamFlavor("Vanilla");
		dto.setPrice(10.0);
		
	IceCreamDto dto1 = new IceCreamDto();
		dto1.setIceCreamBrand("Dinshaw's");
		dto1.setIceCreamFlavor("ButterScotch");
		dto1.setPrice(25);
		
	IceCreamDto dto2 = new IceCreamDto();
		dto2.setIceCreamBrand("Mother Dairy");
		dto2.setIceCreamFlavor("Strawberry");
		dto2.setPrice(30);
		
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	
	}
}