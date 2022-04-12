
public class BasketballPlayer extends Player {
	private int freeThrowPercentage;

	public BasketballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasketballPlayer(int playerNumber, String lastName, String firstName, String position, String homeTown,
			String homeState) {
		super(playerNumber, lastName, firstName, position, homeTown, homeState);
		// TODO Auto-generated constructor stub
	}

	public int getFreeThrowPercentage() {
		return freeThrowPercentage;
	}

	public void setFreeThrowPercentage(int freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}
	
	public String formatPlayerInformation() {
		String playerFormat = "#" + this.getPlayerNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", " + this.getPosition() + " - " + this.getHomeTown() + ", " + this.getHomeState() + ". Free throw percentage: " + this.getFreeThrowPercentage() + ".";
		return playerFormat;
	}
}
