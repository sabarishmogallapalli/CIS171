import java.util.ArrayList;
import java.util.Arrays;

public class BowlingLeagueMogallapalli2 {
	public static void main(String[] args) {
		Team teamOne = new Team("St. Louis Saints", 7, "Steve");
		Team teamTwo = new Team("Minnesota Mavericks", 7, "Marty");
		Team teamThree = new Team("Iowa Cornhuskers", 2, "Ivy");
		Team teamFour = new Team("Waukee Warriors", 20, "Walter");
		Team teamFive = new Team("Northwest Wolves", 8, "Noah");;
		ArrayList<Team> teams = new ArrayList<Team>();
		teams.add(teamOne);
		teams.add(teamTwo);
		teams.add(teamThree);
		teams.add(teamFour);
		teams.add(teamFive);
		for (Team team: teams) {
			System.out.println(team.repeatTeam());
		}
		try {
			teamOne = new Team("St. Louis Saints", 6, "Steve");
		} catch (Exception e) {
			System.out.println("Team one: " + e.getMessage() + ". Number of players have to be between 7 and 13.");
			
		}
		try {
			teamTwo = new Team("Minnesota Mavericks", 14, "Marty");
		} catch (Exception e) {
			System.out.println("Team two: " + e.getMessage() + ". Number of players have to be between 7 and 13.");
		}
		try {
			teamThree = new Team("Iowa Cornhuskers", 11, "Ivy");
		} catch (Exception e) {
			System.out.println("Team three: " + e.getMessage());
		}
		try {
			teamFour = new Team("", 12, "Walter");
		} catch (Exception e) {
			System.out.println("Team four: " + e.getMessage() + ". Team name cannot be blank.");
		}
		try {
			teamFive = new Team("Northwest Wolves", 8, "Noah");
		} catch (Exception e) {
			System.out.println("Team five: " + e.getMessage());
		}
	}
}
