class GodUtil{

	public static void main(String a[]){
	
	GodDto dto = new GodDto();
		dto.setGodName("SriManjunatha Swamy");
		dto.setLocation("Dharmasthala");
		dto.setState("Karntaka");
		
	GodDto dto1 = new GodDto();
		dto1.setGodName("Venkanteshwara Swamy");
		dto1.setLocation("Tirupathi");
		dto1.setState("AndhraPradesh");
		
	GodDto dto2= new GodDto();
		dto2.setGodName("KanchiKamaskashi");
		dto2.setLocation("Kanchi");
		dto2.setState("TamilNadu");
		
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	}

}