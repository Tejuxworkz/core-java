import java.util.Scanner;

class ExamUtilConst{
  
	static String[] hallTicket= new String[3];

		public static void main(String a[]){
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the Candidate Name");
			String candidateName=sc.next();

		System.out.println("Enter the USN No");
		String usnNo=sc.next();

		System.out.println("Enter the subject");
		String subjectName=sc.next();

			hallTicket[0]= candidateName;
			hallTicket[1]= usnNo;
			hallTicket[2]= subjectName;

	System.out.println("main method started");

		ExamConst exam=new ExamConst("VTU",1350);

		exam.allow(hallTicket);
		exam.allow(1001);
		System.out.println("main method end");
		System.out.println(exam.universityName+" "+exam.fees);//default value will be printed becuase of instance and local varName is same.So,to difference then we need to use *this* Keyword
}
}


 


