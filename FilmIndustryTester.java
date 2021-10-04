class FilmIndustryTester{

	public static void main(String a[]){
	
	FilmIndustry movie1=new FilmIndustry();
	
	System.out.println("KollyWood");
	movie1.heroName="Vijay";
	movie1.herioneName="Samantha";
	
	System.out.println(movie1.heroName+" "+movie1.herioneName);
	movie1.watch();
	System.out.println();
	
	FilmIndustry movie2=new FilmIndustry();
	
	System.out.println("TollyWood");
	movie2.heroName="PanjaVaishavTej";
	movie2.herioneName="KritiShetty";
	
	System.out.println(movie2.heroName+" "+movie2.herioneName);
	movie2.watch();
	System.out.println();

	FilmIndustry movie3=new FilmIndustry();
	
	System.out.println("SandalWood");
	movie3.heroName="Darshan";
	movie3.herioneName="Rakshitha";
	
	System.out.println(movie3.heroName+" "+movie3.herioneName);
	movie3.watch();

	}


}