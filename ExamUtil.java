import java.util.Scanner;
class ExamUtil{
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
 Exam.allow(hallTicket);
 Exam.allow(10);
System.out.println("main method end");
}
}


 


