class PropertyDTOUtil{

	public static void main(String a[]){
	
		PropertyDTO pdto = new PropertyDTO();
		pdto.setPropertyHolder("Teju");
		pdto.setSize("30*40site");
		pdto.setPrice(1000000);
		
	System.out.println(pdto.getPropertyHolder()+" "+pdto.getSize()+" "+pdto.getPrice());
	
	}

}