
public class PlayerTesterMogallapalli {
	public static void main(String[] args) {
		Player playerOne = new Player(7, "Durant", "Kevin", "Forward", "Washington D.C.", "Washington");
		BasketballPlayer playerTwo = new BasketballPlayer (6, "James", "LeBron", "Forward", "Akron", "Ohio");
		playerTwo.setFreeThrowPercentage(73);
		FootballPlayer playerThree = new FootballPlayer (26, "Peterson", "Adrian", "Running Back", "Palestine", "Texas");
		playerThree.setRushingYards(14918);
		FootballPlayer playerFour = new FootballPlayer(32, "Simpson", "O.J.", "Running Back", "San Francisco", "California");
		playerFour.setRushingYards(11236);
		Roster rosterOne = new Roster();
		rosterOne.addToTeam(playerOne);
		rosterOne.addToTeam(playerTwo);
		rosterOne.setCoachName("Sabarish Mogallapalli");
		rosterOne.setTeamName("Waukee Warriors");
		Roster rosterTwo = new Roster();
		rosterTwo.addToTeam(playerThree);
		rosterTwo.addToTeam(playerFour);
		rosterTwo.setCoachName("Joe Davis");
		rosterTwo.setTeamName("Northwest Wolves");
		System.out.println(playerOne.formatPlayerInformation());
		System.out.println(playerTwo.formatPlayerInformation());
		System.out.println(playerThree.formatPlayerInformation());
		System.out.println(playerFour.formatPlayerInformation());
		System.out.println(rosterOne.displayRoster());
		System.out.println(rosterTwo.displayRoster());
	}
}
