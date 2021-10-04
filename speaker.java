class speaker{

static String name="Boat";
static int minVolume=0;
static int maxVolume=15;
static boolean isConnected=false;
static int currentVolume;


public static boolean onOrOff(){
System.out.println("Inside the onOrOff");

if(isConnected==false){
    isConnected=true;
System.out.println("Speaker is turned on");
return isConnected;
}

else if(isConnected==true){
isConnected=false;
System.out.println("Speaker is turned off");
return isConnected;   
}

System.out.println("End of the onOrOff");
return false;
}



public static void increaseVolume(){
System.out.println("inside increase volume");
if(isConnected){

     if(currentVolume<maxVolume){   
        currentVolume=currentVolume+1;
     System.out.println("The current volume is : "+currentVolume);
     }

     else{
     System.out.println("Max Volume is reached");
     }
}
else{
System.out.println("Please turned on the speaker");
}
System.out.println("end of increase volume");
}


public static void decreaseVolume(){

System.out.println("inside descrease volume");
if(isConnected){
 
      if(currentVolume>minVolume){ 
         currentVolume=currentVolume-1;
      System.out.println("The current volume is : "+currentVolume);
      }

      else{
      System.out.println("Min Volume is reached");
      }

}
else{
System.out.println("Please turned off the speaker");
}
System.out.println("end of decrease volume");
}
}
























































































