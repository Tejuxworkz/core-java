class GoldDTOUtil{

	public static void main(String a[]){
	
		GoldDTO gd = new GoldDTO();
		gd.setTypeofGold("22K");
		gd.setWeight("200g");
		gd.setPrice(120000);
		
	System.out.print(gd.getTypeofGold()+" "+gd.getWeight()+" "+gd.getPrice());
	}


}