public class PropertyDTO{

	public PropertyDTO(){
	System.out.println("Property object is created");
	}
	
	private String propertyHolder;
	private String size;
	private long price;
	
	public String getPropertyHolder(){
		return propertyHolder;
	}
	
	public void setPropertyHolder(String propertyHolder){
		this.propertyHolder =  propertyHolder;
	}
	
	public String getSize(){
		return size;
	}
	
	public void setSize(String size){
		this.size=size;
	}
	
	public long getPrice(){
		return price;
	}
	
	public void setPrice(long price){
		this.price=price;
	}
}