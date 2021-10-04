class MechUtil{

	public static void main(String a[]){
	
	System.out.println();
	
		Mech mech = new Mech();
			
			mech.studentName = "Sachin";
			mech.branchName = "MECHINAL";
			mech.university = "VTU";
			mech.displayDetails();
			
			String solvermech = mech.toSolveProblems();
			System.out.println(solvermech);
			
	}

}