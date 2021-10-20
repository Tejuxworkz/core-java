class ContinentsDto{

	private String nameOfContinent;
	private int noOfCountries;
	private String popularFor;
	
	public ContinentsDto(){
	System.out.println("Continents onject is created");
	}
	
	public void setNameOfContinent(String nameOfContinent){
	this.nameOfContinent=nameOfContinent;
	}
	
	public void setNoOfCountries(int noOfCountries){
	this.nameOfContinent=nameOfContinent;
	}
	
	public void setPopularFor(String popularFor){
	this.popularFor=popularFor;
	}
	
	@Override
	public String toString(){
	return "ContinentsDto -[nameOfContinent = " +this.nameOfContinent+", noOfCountries  = " +this.noOfCountries+", popularFor = " +this.popularFor+"]";
	}

}