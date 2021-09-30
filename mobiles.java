class mobiles{

static String phones[]={"Nokia","Samsung","Sony","MI","iPhone","Lenovo","Oppo","Vivo","RedMe","Huawei","Motorola","HP","Karbonn","Lava","Micromax","OnePlus","TCL"};

static String phone="LG";

public static void main(String []a){

getPhones(phones);

String Phones=getPhones(phone);
System.out.println(Phones);
}

public static void getPhones(String[] phones){
System.out.println("The phonesBrands are");
for(int i=0;i<phones.length;i++){
System.out.println(phones[i]);
}
}

public static String getPhones(String phone){
return phone;
}
}


