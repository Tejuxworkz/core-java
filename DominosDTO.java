class DominosDTO{

	public DominosDTO(){
		System.out.println("Dominos object is created");		
	}
	
	private int id;
	private String location;
	private String item;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	} 
	
	public String getLocation(){
		return location;
	}
	
	public void setLocation(String location){
		this.location=location;
	}
	
	public String getItem(){
		return item;
	}
	
	public void setItem(String item){
		this.item=item;
	}
}