class GamesDto{

	private int gameId;
	private String gameName;
	private int noOfPlayers;
	
	public GamesDto(){
	System.out.println("games object is created");
	}
	
	public void setGameId(int gameId){
	this.gameId=gameId;
	}
	
	public void setGameName(String gameName){
	this.gameName=gameName;
	}
	
	public void setNoOfPlayers(int noOfPlayers){
	this.noOfPlayers=noOfPlayers;
	}
	
	@Override
	public String toString(){
	return "gamesDto -[gameId=" +this.gameId+", gameName=" +this.gameName+", noOfPlayers=" +this.noOfPlayers+" ]";
	}
		
}