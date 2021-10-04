class speakerUtil{

public static void main(String a[]){

String Name=speaker.name;
System.out.println(Name);

boolean isConnected=speaker.onOrOff();
System.out.println("The speaker is connected" +isConnected);


speaker.increaseVolume();
speaker.increaseVolume();
speaker.increaseVolume();
speaker.increaseVolume();
speaker.increaseVolume();
speaker.increaseVolume();
speaker.increaseVolume();



speaker.decreaseVolume();
speaker.decreaseVolume();
speaker.decreaseVolume();
speaker.decreaseVolume();
speaker.decreaseVolume();
speaker.decreaseVolume();


boolean isConnect=speaker.onOrOff();
System.out.println("The speaker is notconnected" +isConnect);


speaker.increaseVolume();
speaker.increaseVolume();

boolean connect=speaker.onOrOff();
System.out.println("The speaker is notconnected" +connect);

speaker.decreaseVolume();
speaker.decreaseVolume();



}
}
