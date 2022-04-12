
public class FootballPlayer extends Player {
	private int rushingYards;
	
	public FootballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FootballPlayer(int playerNumber, String lastName, String firstName, String position, String homeTown,
			String homeState) {
		super(playerNumber, lastName, firstName, position, homeTown, homeState);
		// TODO Auto-generated constructor stub
	}

	public int getRushingYards() {
		return rushingYards;
	}

	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
	}
	
	public String formatPlayerInformation() {
		String playerFormat = "#" + this.getPlayerNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", " + this.getPosition() + " - " + this.getHomeTown() + ", " + this.getHomeState() + ". Rushing yards: " + this.getRushingYards() + ".";
		return playerFormat;
	}
}
