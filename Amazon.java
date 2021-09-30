class Amazon{

static String movies[]={"Shershaah","Cindrella","Jathi Rathnalu"}; 
static String series[]={"Four More Shots","Vampire Diaries","Mumbai Diaries"};


static String movie="Dia";
static String serie="The last ship";

public static void main(String []a){
System.out.println("main method started");

getMovies(movies);

String Movie=getMovies(movie);
System.out.println(Movie);

getSeries(series);

String Serie=getSeries(serie);
System.out.println(Serie);
}


public static void getMovies(String[] movies){
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
}


public static String getMovies(String movie){
return movie;
}

public static void getSeries(String[] series){
for(int i=0;i<series.length;i++){
System.out.println(series[i]);
}
}

public static String getSeries(String serie){
return serie;
}
}






