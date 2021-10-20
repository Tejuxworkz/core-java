class CurrencyDto{

	private String country;
	private String currency;
	
	public CurrencyDto(){
	System.out.println("Cuurency object is created");
	}
	
	public void setCountry(String country){
	this.country=country;
	}
	
	public void setCurrency(String currency){
	this.currency=currency;
	}
	
	@Override
	public String toString(){
	return "CurrencyDto = [country= " +this.country+" , currency= "+this.currency+"]"; 
	}

}