class GamesTester{

	public static void main(String a[]){
	
	GamesDto dto = new GamesDto();
		dto.setGameName("Candy-Crush");
		dto.setNoOfPlayers(1);
		
	
	GamesDto dto1 = new GamesDto();
		dto1.setGameName("Batminton");
		dto1.setNoOfPlayers(2);
		
	GamesDto dto2 = new GamesDto();
		dto2.setGameName("FootBall");
		dto2.setNoOfPlayers(11);
	
	
	System.out.println(dto);
	System.out.println(dto1);
	System.out.println(dto2);
	}

}