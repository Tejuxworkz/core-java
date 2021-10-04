class EceUtil{

	public static void main(String a[]){
	
	System.out.println();
	
		Ece ece = new Ece();
			
			ece.studentName = "Tejashwini";
			ece.branchName = "ECE";
			ece.university = "VTU";
			ece.displayDetails();
			
		String solverece = ece.toSolveProblems();
		System.out.println(solverece);	
			
	}

}