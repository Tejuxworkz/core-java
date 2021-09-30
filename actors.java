class actors{

static String actornames[]={"PanjaVaishavTej","Prabhas","Darshan","Sundeep","ShahrukhKhan","Chiranjeevi","RaviChandran","Soundarya","RamyaKrishna","Puneeth","Savithri","Bhavya","Rakshitha","Ramya","NTR","Akhil","PawanKalyan","AlluArjun","ChiranjeeviSarja","DhruvaSarja","ArjunSarja"};

static String actorname="PriyankaChopra";

public static void main(String []a){

getActornames(actornames);

String Actorname=getActornames(actorname);
System.out.println(Actorname);
}

public static void getActornames(String[] actornames){
System.out.println("The actors are");
for(int i=0;i<actornames.length;i++){
System.out.println(actornames[i]);
}
}

public static String getActornames(String actorname){
return actorname;
}
}

