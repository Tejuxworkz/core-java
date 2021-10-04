class CivilUtil{

	public static void main(String a[]){
	
	System.out.println();
		
		Civil civil =  new Civil();
		
			civil.studentName = "Uma";
			civil.branchName = "CIVIL";
			civil.university = "VTU";
			civil.displayDetails();
			
			String solverciv = civil.toSolveProblems();
			System.out.println(solverciv);
			
	}

}