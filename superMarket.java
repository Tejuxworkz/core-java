class superMarket{

static String beverages[]={"Coffee","Iced tea","Juice","Lemonade","Soft Drinks","Tea"};
static String snacks[]={"Candy","Chips","Dip","Dried Fruits","Gum","Popcorn"};
static String personalCares[]={"Lip Balm","Soap","Sunscreen","ToothBrush","ToothPaste","Shampoo"};
static String diaryProducts[]={"Butter","Cheese","Cream","Milk","Sour Cream","Yogurt"};
static String herbsAndSpices[]={"Basil","Cinnanmon","Cloves","Garlic","Pepper"};
static String cleaners[]={"Air Freshers","Bleach","Dishwasher detergent","Glass Cleaner","Stain Remover"};

static String beverage="Water";
static String snack="Toffees";
static String personalCare="Conditioner";
static String diaryProduct="Panner";
static String herbsAndSpice="Cardamom";
static String cleaner="Washing Liquid";


public static void main(String []a){

getBeverages(beverages);

String Beverage=getBeverages(beverage);
System.out.println(Beverage);

getSnacks(snacks);

String Snack=getSnacks(snack);
System.out.println(Snack);

getPersonalCares(personalCares);

String PersonalCare=getPersonalCares(personalCare);
System.out.println(PersonalCare);

getDiaryProducts(diaryProducts);

String DiaryProduct=getDiaryProducts(diaryProduct);
System.out.println(DiaryProduct);

getHerbsAndSpices(herbsAndSpices);

String HerbsAndSpice=getHerbsAndSpecies(herbsAndSpice);
System.out.println(HerbsAndSpice);

getCleaners(cleaners);

String Cleaner=getCleaners(cleaner);
System.out.println(Cleaner);
}

public static void getBeverages(String beverages[]){
System.out.println("The beverages are ");
for(int i=0;i<beverages.length;i++){
System.out.println(beverages[i]);
}
}

public static String getBeverages(String beverage){
return beverage;
}

public static void getSnacks(String[] snacks){
System.out.println("The snacks are ");
for(int i=0;i<snacks.length;i++){
System.out.println(snacks[i]);
}
}

public static String getSnacks(String snack){
return snack;
}


public static void getPersonalCares(String[] personalCares){
System.out.println("The personal cares are ");
for(int i=0;i<personalCares.length;i++){
System.out.println(personalCares[i]);
}
}
public static String getPersonalCares(String personalCare){
return personalCare;
}

public static void getDiaryProducts(String[] diaryProducts){
System.out.println("The diary products are ");
for(int i=0;i<diaryProducts.length;i++){
System.out.println(diaryProducts[i]);
}
}

public static String getDiaryProducts(String diaryProduct){
return diaryProduct;
}

public static void getHerbsAndSpices(String[] herbsAndSpices){
System.out.println("The herbs and spices are ");
for(int i=0;i<herbsAndSpices.length;i++){
System.out.println(herbsAndSpices[i]);
}
}

public static String getHerbsAndSpecies(String herbsAndSpice){
return herbsAndSpice;
}

public static void getCleaners(String[] cleaners){
System.out.println("The cleaners products are ");
for(int i=0;i<cleaners.length;i++){
System.out.println(cleaners[i]);
}
}

public static String getCleaners(String cleaner){
return cleaner;
}
}






