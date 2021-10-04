class CocoColaUtil{

	public static void main(String a[]){
	
	CocoCola coco = new CocoCola();
		coco.employName = "Akila";
		coco.companyName = "Coco-Cola";
		coco.location = "Hyderbad";
		coco.displayDetails();
		
	String cocopro = coco.provideServices();
	System.out.println(cocopro);
	}
}