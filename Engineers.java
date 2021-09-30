import java.util.Scanner;

class Engineers{

		
	public static void main(String a[]){
	
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String branchName[]=new String[size];

	for(int i=0;i<size;i++){
		System.out.println("Enter the elements");
		branchName[i]=sc.next();	
	}
	
	for(int i=0;i<branchName.length;i++){
		System.out.println(branchName[i]);	
	}

	}
}