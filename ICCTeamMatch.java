class ICCTeamMatch{

	public static void main(String a[]){
	
	ICCTeam team1=new ICCTeam();
	
	team1.teamName="CSK";
	team1.teamCaptain="MSDhoni";
	
	System.out.println(team1.teamName+" "+team1.teamCaptain);
	team1.play();
	System.out.println();
	
	ICCTeam team2=new ICCTeam();
	
	team2.teamName="MI";
	team2.teamCaptain="RohitSharma";
	
	System.out.println(team2.teamName+" "+team2.teamCaptain);
	team2.play();
	System.out.println();
	
	ICCTeam team3=new ICCTeam();
	
	team3.teamName="RCB";
	team3.teamCaptain="ViratKohli";
	
	System.out.println(team3.teamName+" "+team3.teamCaptain);
	team3.play();
	System.out.println();
	}


}