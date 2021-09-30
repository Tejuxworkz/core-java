//parameter:a variable declared within a paranthesis or method signature.


class Weapons{
public static void main(String []a){

//initialising by literals

           //String names[] = {"Bomb","Gun","Tank"};
           
           //System.out.println(names[1]);//printing
           
           //names[1]="Submarine";//changing the variables or name we initialised
           //System.out.println(names[1]);//latest is printed

// initialising by New Keyword

           String []typesOfGun=new String[10];
           typesOfGun[0]="automatic";
           typesOfGun[1]="short-gun";
 System.out.println(typesOfGun.length);
    for(int type=0;type<typesOfGun.length;type++)
{
      System.out.println(typesOfGun[type]);
}
}
}


      
