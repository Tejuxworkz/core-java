class CseUtil{

	public static void main(String a[]){
	
	System.out.println();
	
	Cse cse = new Cse();
		
			cse.studentName = "Priya";
			cse.branchName = "CSE";
			cse.university = "VTU";
			cse.displayDetails();
			
			String solvercse = cse.toSolveProblems();
			System.out.println(solvercse);
			
	}
	
}