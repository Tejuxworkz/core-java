class EeeUtil{

	public static void main(String a[]){
	
	System.out.println();
		
		Eee eee = new Eee();
		
			eee.studentName = "Lalit";
			eee.branchName = "EEE";
			eee.university = "VTU";
			eee.displayDetails();
			
			String solvereee = eee.toSolveProblems();
			System.out.println(solvereee);
			
	}
	
}