import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Feb 10, 2022
 */

public class RockPaperScissorsMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Player 1 pick one of these five: rock, paper, scissors, spock, lizard");
		String player1 = (input.next());
		String playerOne = (player1.toLowerCase());
		System.out.println("Player 2 pick one of these five: rock, paper, scissors, spock, lizard");
		String player2 = (input.next());
		String playerTwo = (player2.toLowerCase());
		System.out.println("The winner is: " + RockPaperScissors(playerOne, playerTwo));
		input.close();

	}

	public static String RockPaperScissors(String playerUno, String playerDos) {
		String winner = "no one";
		if (playerUno.contentEquals("spock")) {
			if (playerDos.contentEquals("scissors")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("rock")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("paper")) {
				winner = "Player 2";
			}

			else if (playerDos.contentEquals("lizard")) {
				winner = "Player 2";
			}

		} else if (playerUno.contentEquals("rock")) {
			if (playerDos.contentEquals("scissors")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("spock")) {
				winner = "Player 2";
			}

			else if (playerDos.contentEquals("paper")) {
				winner = "Player 2";
			}

			else if (playerDos.contentEquals("lizard")) {
				winner = "Player 1";
			}

		} else if (playerUno.contentEquals("lizard")) {
			if (playerDos.contentEquals("scissors")) {
				winner = "Player 2";
			}

			else if (playerDos.contentEquals("spock")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("paper")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("rock")) {
				winner = "Player 2";
			}

		} else if (playerUno.contentEquals("paper")) {
			if (playerDos.contentEquals("rock")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("scissors")) {
				winner = "Player 2";
			} else if (playerDos.contentEquals("spock")) {
				winner = "Player 1";
			} else if (playerDos.contentEquals("lizard")) {
				winner = "Player 2";
			}
		} else if (playerUno.contentEquals("scissors")) {
			if (playerDos.contentEquals("paper")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("lizard")) {
				winner = "Player 1";
			}

			else if (playerDos.contentEquals("rock")) {
				winner = "Player 2";
			} else if (playerDos.contentEquals("spock")) {
				winner = "Player 2";
			}
		}
		return winner;
	}

}
