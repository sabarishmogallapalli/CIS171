
public class Player {
	private int playerNumber;
	private String lastName;
	private String firstName;
	private String position;
	private String homeTown;
	private String homeState;
	
	public Player() {
		setPlayerNumber(12);
		setLastName("Davis");
		setFirstName("Joe");
		setPosition("Quarterback");
		setHomeTown("Waukee");
		setHomeState("Iowa");
	}
	
	public Player(int playerNumber, String lastName, String firstName, String position, String homeTown, String homeState) {
		setPlayerNumber(playerNumber);
		setLastName(lastName);
		setFirstName(firstName);
		setPosition(position);
		setHomeTown(homeTown);
		setHomeState(homeState);
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getHomeState() {
		return homeState;
	}
	public void setHomeState(String homeState) {
		this.homeState = homeState;
	}
	
	public String formatPlayerInformation() {
		String playerFormat = "#" + this.getPlayerNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", " + this.getPosition() + " - " + this.getHomeTown() + ", " + this.getHomeState();
		return playerFormat;
	}
	
	@Override
	public String toString() {
		return "Player [playerNumber=" + playerNumber + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", position=" + position + ", homeTown=" + homeTown + ", homeState=" + homeState + "]";
	}
}
