import java.util.Random;
import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Feb 22, 2022
 */

public class RPSLSMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Player 1 pick one of these five: rock, paper, scissors, spock, lizard");
		String player1 = (input.next());
		String playerOne = (player1.toLowerCase());
		while (!playerOne.equals("done")) {
			if (playerOne.equals("rock") || playerOne.equals("paper") || playerOne.equals("scissors")
					|| playerOne.equals("spock") || playerOne.equals("lizard")) {
				String player2 = RandomChoice();
				System.out.println("Player 2's pick is: " + player2);
				String playerTwo = (player2.toLowerCase());
				if (playerTwo.equals("rock") || playerTwo.equals("paper") || playerTwo.equals("scissors")
						|| playerTwo.equals("spock") || playerTwo.equals("lizard")) {
					System.out.println("The winner is: " + RockPaperScissors(playerOne, playerTwo));
				} else {
					System.out.print("invalid input");
				}
			} else {
				System.out.print("invalid input");
			}
			System.out.println("Player 1 pick one of these five: rock, paper, scissors, spock, lizard");
			player1 = (input.next());
			playerOne = (player1.toLowerCase());
		}

		input.close();

	}

	public static String RockPaperScissors(String playerUno, String playerDos) {
		String winner = "Player 1";
		switch (playerUno) {
		case "rock": {
			switch (playerDos) {
			case "rock": {
				return winner = "Tie";
			}
			case "paper": {
				return winner = "Player 2";
			}
			case "scissors": {
				return winner = "Player 1";
			}
			case "lizard": {
				return winner = "Player 1";
			}
			case "spock": {
				return winner = "Player 2";
			}
			}
		}
		case "paper": {
			switch (playerDos) {
			case "rock": {
				return winner = "Player 1";
			}
			case "paper": {
				return winner = "Tie";
			}
			case "scissors": {
				return winner = "Player 2";
			}
			case "lizard": {
				return winner = "Player 2";
			}
			case "spock": {
				return winner = "Player 1";
			}
			}
		}
		case "scissors": {
			switch (playerDos) {
			case "rock": {
				return winner = "Player 2";
			}
			case "paper": {
				return winner = "Player 1";
			}
			case "scissors": {
				return winner = "Tie";
			}
			case "lizard": {
				return winner = "Player 1";
			}
			case "spock": {
				return winner = "Player 2";
			}
			}
		}
		case "lizard": {
			switch (playerDos) {
			case "rock": {
				return winner = "Player 2";
			}
			case "paper": {
				return winner = "Player 1";
			}
			case "scissors": {
				return winner = "Player 2";
			}
			case "lizard": {
				return winner = "Tie";
			}
			case "spock": {
				return winner = "Player 1";
			}
			}
		}
		case "spock": {
			switch (playerDos) {
			case "rock": {
				return winner = "Player 1";
			}
			case "paper": {
				return winner = "Player 2";
			}
			case "scissors": {
				return winner = "Player 1";
			}
			case "lizard": {
				return winner = "Player 2";
			}
			case "spock": {
				return winner = "Tie";
			}
			}
		}
		}
		return winner;
	}

	public static String RandomChoice() {
		int largestNum = 5;
		int smallestNum = 1;
		String twoChoice = "";
		Random randomNumber = new Random();
		int playerTwo = randomNumber.nextInt((largestNum - smallestNum) + 1) + smallestNum;
		if (playerTwo == 1) {
			twoChoice = "Rock";
		} else if (playerTwo == 2) {
			twoChoice = "Paper";
		} else if (playerTwo == 3) {
			twoChoice = "Scissors";
		} else if (playerTwo == 4) {
			twoChoice = "Lizard";
		} else if (playerTwo == 5) {
			twoChoice = "Spock";
		}
		return twoChoice;

	}

}