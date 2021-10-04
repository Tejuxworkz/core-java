class MusicalInstUtil{

	public static void main(String a[]){
	
	MusicalInstruments music=new MusicalInstruments();//we should not create the outside the methods
 
	System.out.println();
	System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);//complier we assign the defaultvalue once the object is created
	System.out.println();
	
	music.name="Violin";
	music.price=2500.35;
	music.frequency="4Hz";
	music.type="Classical";
	
	System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);
	
	music.play(music.name);
	}
}


