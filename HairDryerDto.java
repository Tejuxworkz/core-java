package com.xworkz.collectionapp.dto;

public class HairDryerDto {

	int id;
	int serialNo;
	String genericName;
	double price;
	String modelName;
	String productSpecification;
	String quantity;
	String monthOfImport;
	int yearOfImport;
	String importedBy;
	
	public HairDryerDto() {
		this(8,68,"HairDryer",749.00,"VHDH-05","220-240V,50/60Hz","1-Hair-Dryer,1-WarrentyCard","July",2016,"Tri-Star Product lmt");
		System.out.println("HairDyer Object is Created");
	}
	
	public HairDryerDto(int id,int serialNo,String genericName,double price,String modelName,String productSpecification,String quantity,
						String monthOfImport,int yearOfImport,String importedBy) {
		this.id = id;
		this.serialNo = serialNo;
		this.genericName = genericName;
		this.price = price;
		this.modelName = modelName;
		this.productSpecification = productSpecification;
		this.quantity = quantity;
		this.monthOfImport = monthOfImport;
		this.yearOfImport = yearOfImport;
		this.importedBy = importedBy;
	}
	
	@Override
	public String toString() {
		
		return "HairDryerDto-[setId:"+this.id+" "+"setSerialNo:"+this.serialNo+" "+"setGenericName:"+this.genericName+" "+"setPrice:"+this.price+" "+
				"setModelName:"+this.modelName+" "+"setProductSpecification:"+this.productSpecification+" "+"setQuantity:"+this.quantity+" "+
				"setMonthOfImport:"+this.monthOfImport+" "+"setYearOfImport:"+this.yearOfImport+" "+"setImportedBy:"+this.importedBy+"]";
	}
	
	
	
}
