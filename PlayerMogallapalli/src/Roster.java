import java.util.ArrayList;

public class Roster {
	private String teamName;
	private String coachName;
	private ArrayList<Player> teamList;
	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getCoachName() {
		return coachName;
	}


	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	
	public Roster() {
		teamList = new ArrayList<Player>();	
	}


	public Roster(String teamName, String coachName) {
		this.teamName = teamName;
		this.coachName = coachName;
	}
	
	
	public void addToTeam(Player p) {
		teamList.add(p);
	}
	
	public String displayRoster() {
		StringBuilder teamBuilder = new StringBuilder();
		teamBuilder.append(teamName + " - Coached by " + coachName + "\n");
		
		for (Player p : teamList) {
			teamBuilder.append(p.formatPlayerInformation() + "\n");
		}
		return teamBuilder.toString();
	}
}
