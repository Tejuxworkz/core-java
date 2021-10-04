public class GoldDTO{

	public GoldDTO(){
		System.out.println("GoldDTO is created");
	}
	
	private String typeofGold;
	private float price;
	private String weight;
	
	public String getTypeofGold(){
		return typeofGold;
	}
	
	public void setTypeofGold(String typeofGold){
		this.typeofGold=typeofGold;
	}
	
	public float getPrice(){
		return price;
	}
	
	public void setPrice(float price){
		this.price=price;
	}
	
	public String getWeight(){
		return weight;
	}
	
	public void setWeight(String weight){
		this.weight=weight;
	}
} 