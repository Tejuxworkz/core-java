class IceCreamDto{

	private String iceCreamBrand;
	private String iceCreamFlavor;
	private double price;
	
	public IceCreamDto(){
	System.out.println("IceCream object is created");
	}
	
	public void setIceCreamBrand(String iceCreamBrand){
	this.iceCreamBrand=iceCreamBrand;
	}
	
	public void setIceCreamFlavor(String iceCreamFlavor){
	this.iceCreamFlavor=iceCreamFlavor;
	}
	
	public void setPrice(double price){
	this.price=price;
	}
	
	@Override
	public String toString(){
	return "IceCreamDto - [iceCreamBrand= " +this.iceCreamBrand+ ", iceCreamFlavor= " +this.iceCreamFlavor+ ", price= " +this.price+ "]";
	}
	
}