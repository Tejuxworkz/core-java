import java.util.Scanner;

class arthOpers{
public static void main(String a[]){

Scanner scanner=new Scanner(System.in);

System.out.println("Byte Numbers");
byte b1=scanner.nextByte();
byte b2=scanner.nextByte();

byte b3=scanner.nextByte();
byte b4=scanner.nextByte();

byte b5=scanner.nextByte();
byte b6=scanner.nextByte();

byte b7=scanner.nextByte();
byte b8=scanner.nextByte();

System.out.println("Short Numbers");
short s1=scanner.nextShort();
short s2=scanner.nextShort();

short s3=scanner.nextShort();
short s4=scanner.nextShort();

short s5=scanner.nextShort();
short s6=scanner.nextShort();

short s7=scanner.nextShort();
short s8=scanner.nextShort();

System.out.println("Int Numbers");
int i1=scanner.nextInt();
int i2=scanner.nextInt();

int i3=scanner.nextInt();
int i4=scanner.nextInt();

int i5=scanner.nextInt();
int i6=scanner.nextInt();

int i7=scanner.nextInt();
int i8=scanner.nextInt();

System.out.println("Long Numbers");
long l1=scanner.nextLong();
long l2=scanner.nextLong();

long l3=scanner.nextLong();
long l4=scanner.nextLong();

long l5=scanner.nextLong();
long l6=scanner.nextLong();

long l7=scanner.nextLong();
long l8=scanner.nextLong();

System.out.println("Float Numbers");
float f1=scanner.nextFloat();
float f2=scanner.nextFloat();

float f3=scanner.nextFloat();
float f4=scanner.nextFloat();

float f5=scanner.nextFloat();
float f6=scanner.nextFloat();

float f7=scanner.nextFloat();
float f8=scanner.nextFloat();

System.out.println("Double Numbers");
double d1=scanner.nextDouble();
double d2=scanner.nextDouble();

double d3=scanner.nextDouble();
double d4=scanner.nextDouble();

double d5=scanner.nextDouble();
double d6=scanner.nextDouble();

double d7=scanner.nextDouble();
double d8=scanner.nextDouble();


System.out.println("Addition");
byteAdd(b1,b2);
shortAdd(s1,s2);
intAdd(i1,i2);
longAdd(l1,l2);
floatAdd(f1,f2);
doubleAdd(d1,d2);

System.out.println("Substration");
byteSub(b3,b4);
shortSub(s3,s4);
intSub(i3,i4);
longSub(l3,l4);
floatSub(f3,f4);
doubleSub(d3,d4);

System.out.println("Multiplication");
byteMul(b5,b6);
shortMul(s5,s6);
intMul(i5,i6);
longMul(l5,l6);
floatMul(f5,f6);
doubleMul(d5,d6);

System.out.println("Division");
byteDiv(b7,b8);
shortDiv(s7,s8);
intDiv(i7,i8);
longDiv(l7,l8);
floatDiv(f7,f8);
doubleAdd(d7,d8);

}

static void byteAdd(byte b1,byte b2){
int sum=b1+b2;
System.out.println("The sum of byte numbers is" +sum);
}

static void shortAdd(short s1,short s2){
int sum=s1+s2;
System.out.println("The sum of short numbers is" +sum);
}

static void intAdd(int i1,int i2){
int sum=i1+i2;
System.out.println("The sum of int numbers is" +sum);
}

static void longAdd(long l1,long l2){
long sum=l1+l2;
System.out.println("The sum of long numbers is" +sum);
}

static void floatAdd(float f1,float f2){
float sum=f1+f2;
System.out.println("The sum of float numbers is" +sum);
}

static void doubleAdd(double d1,double d2){
double sum=d1+d2;
System.out.println("The sum of double numbers is" +sum);
}



static void byteSub(byte b3,byte b4){
int sub=b3-b4;
System.out.println("The difference of byte numbers is" +sub);
}

static void shortSub(short s3,short s4){
       int sub=s3-s4;
System.out.println("The difference of short numbers is" +sub);
}

static void intSub(int i3,int i4){
int sub=i3-i4;
System.out.println("The difference of int numbers is" +sub);
}

static void longSub(long l3,long l4){
long sub=l3-l4;
System.out.println("The difference of long numbers is" +sub);
}

static void floatSub(float f3,float f4){
float sub=f3-f4;
System.out.println("The difference of float numbers is" +sub);
}

static void doubleSub(double d3,double d4){
double sub=d3-d4;
System.out.println("The difference of double numbers is" +sub);
}



static void byteMul(byte b5,byte b6){
int mul=b5*b6;
System.out.println("The product of byte numbers is" +mul);
}

static void shortMul(short s5,short s6){
int mul=s5*s6;
System.out.println("The product of short numbers is" +mul);
}

static void intMul(int i5,int i6){
int mul=i5*i6;
System.out.println("The product of int numbers is" +mul);
}

static void longMul(long l5,long l6){
long mul=l5*l6;
System.out.println("The product of long numbers is" +mul);
}

static void floatMul(float f5,float f6){
float mul=f5*f6;
System.out.println("The product of float numbers is "+mul);
}

static void doubleMul(double d5,double d6){
double mul=d5*d6;
System.out.println("The product of double numbers is "+mul);
}



static void byteDiv(byte b7,byte b8){
int div=b7/b8;
System.out.println("The division of byte numbers is "+div);
}

static void shortDiv(short s7,short s8){
int div=s7/s8;
System.out.println("The division of short numbers is "+div);
}

static void intDiv(int i7,int i8){
int div=i7/i8;
System.out.println("The division of int numbers is "+div);
}

static void longDiv(long l7,long l8){
long div=l7/l8;
System.out.println("The division of long numbers is "+div);
}

static void floatDiv(float f7,float f8){
float div=f7/f8;
System.out.println("The division of float numbers is "+div);
}

static void doubleDiv(double d7,double d8){
double div=d7/d8;
System.out.println("The division of double numbers is "+div);
}

}



