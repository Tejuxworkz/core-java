class ExamWithConst1{
 
	public String universityName;
	public int fees;
	
	
	public ExamWithConst1(String uniName,int feeS){
		System.out.println("Exams Object Created");
		universityName=uniName;
		fees=feeS;
	}
	
	public void examConduct(){
		System.out.println("Conduct the Exams");
	}	
	
	public void display(){
		System.out.println(universityName+" "+fees);
	}
	public static void main(String a[]){
		
	ExamWithConst1 ec1=new ExamWithConst1("VTU",1350);
	ec1.examConduct();
	ec1.display();//(or) System.out.println("ec1.universityName"+" "+ec1.fees);
	}
	
}