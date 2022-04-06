
public class Team {
	private String teamName;
	private int teamId;
	private static int newTeamId = 9999;
	private int numberOfPlayers;
	private String captain;
	
	public Team() {
		setTeamName("AFC Richmond");
		setNumberOfPlayers(11);
		setCaptain("Roy Kent");
		
		newTeamId++;
		teamId = newTeamId;
	}
	
	public Team(String teamName, int numberOfPlayers, String captain) {
		setTeamName(teamName);
		setNumberOfPlayers(numberOfPlayers);
		setCaptain(captain);
		
		newTeamId++;
		teamId = newTeamId;
		
		
		if(getTeamName() == null || getNumberOfPlayers() == 6 || getNumberOfPlayers() == 14) {
			throw new IllegalArgumentException("Object not created");
		}
		
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
		if (this.teamName == "") {
			this.teamName = null;
		}
		else {
			this.teamName = teamName;
		}
	}
	public int getTeamId() {
		return teamId;
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
		if (7 <= this.numberOfPlayers && this.numberOfPlayers>= 13) {
			this.numberOfPlayers = numberOfPlayers;
		}
		else {
			while (7 > this.numberOfPlayers || 13< this.numberOfPlayers) {
				if (7 <= this.numberOfPlayers && this.numberOfPlayers<= 13) {
					break;
				}
				else {
					System.out.print("Please only enter values between 7 and 13.\n");
					break;
				}
			}
		}
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String repeatTeam() {
		String teamFormat = "Team ID: " + teamId + ", Team Name: " + teamName + ", # of Team Members: " + numberOfPlayers + ", " + captain;
		return teamFormat;
	}
	
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamId=" + teamId + ", numberOfPlayers=" + numberOfPlayers
				+ ", captain=" + captain + "]";
	}
	
	
}
