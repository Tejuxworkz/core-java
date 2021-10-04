public class LicDTO{

	public LicDTO(){
	System.out.println("LIC Objects is created");
	}

	private int policyId;
	private String customerName;
	private String yearsOfBond;
	
	public int getPolicyId(){
		return policyId;
	}
	
	public void setPolicyId(int policyId){
		this.policyId=policyId;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	
	public String getYearsOfBond(){
		return yearsOfBond;
	}
	
	public void setYearsOfBond(String yearsOfBond){
		this.yearsOfBond=yearsOfBond;
	}
	
	
}