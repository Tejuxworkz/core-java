class LicDTOUtil{

	public static void main(String a[]){
	
	LicDTO lic = new LicDTO();
	
		lic.setCustomerName("Teju");
		lic.setPolicyId(999);
		lic.setYearsOfBond("2years");
	
	System.out.println(lic.getPolicyId()+" "+lic.getCustomerName()+" "+lic.getYearsOfBond());
	
	}

}