class MusicalInstConstructorUtil{

	public static void main(String a[]){
	
	MusicalInstrumentsConstructor music=new MusicalInstrumentsConstructor("Violin",2500.35,"4Hz","Classical");
 
	System.out.println();
	System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);
	System.out.println();
	
	music.play(music.name);
	}
}
