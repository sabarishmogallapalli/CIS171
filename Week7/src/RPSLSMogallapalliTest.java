import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Feb 22, 2022
 */

class RPSLSMogallapalliTest {

	@Test
	void upperCase() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("ROCK", "paper"));
	}

	void camelCase() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("Rock", "paper"));
	}

	@Test
	void lowerCase() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("rock", "paper"));
	}

	@Test
	void funkyCase() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("rOcK", "paper"));
	}

	@Test
	void testRockRock() {
		assertEquals("Tie", RPSLSMogallapalli.RockPaperScissors("rock", "rock"));
	}

	@Test
	void testRockPaper() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("rock", "paper"));
	}

	@Test
	void testRockScissors() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("rock", "scissors"));
	}

	@Test
	void testRockLizard() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("rock", "lizard"));
	}

	@Test
	void testRockSpock() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("rock", "spock"));
	}

	@Test
	void testPaperRock() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("paper", "rock"));
	}

	@Test
	void testPaperPaper() {
		assertEquals("Tie", RPSLSMogallapalli.RockPaperScissors("paper", "paper"));
	}

	@Test
	void testPaperScissors() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("paper", "scissors"));
	}

	@Test
	void testPaperLizard() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("paper", "lizard"));
	}

	@Test
	void testPaperSpock() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("paper", "spock"));
	}

	@Test
	void testScissorsRock() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("scissors", "rock"));
	}

	@Test
	void testScissorsPaper() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("scissors", "paper"));
	}

	@Test
	void testScissorsScissors() {
		assertEquals("Tie", RPSLSMogallapalli.RockPaperScissors("scissors", "scissors"));
	}

	@Test
	void testScissorsLizard() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("scissors", "lizard"));
	}

	@Test
	void testScissorsSpock() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("scissors", "spock"));
	}

	@Test
	void testLizardRock() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("lizard", "rock"));
	}

	@Test
	void testLizardPaper() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("lizard", "paper"));
	}

	@Test
	void testLizardScissors() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("lizard", "scissors"));
	}

	@Test
	void testLizardLizard() {
		assertEquals("Tie", RPSLSMogallapalli.RockPaperScissors("lizard", "lizard"));
	}

	@Test
	void testLizardSpock() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("lizard", "spock"));
	}

	@Test
	void testSpockRock() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("spock", "rock"));
	}

	@Test
	void testSpockPaper() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("spock", "paper"));
	}

	@Test
	void testSpockScissors() {
		assertEquals("Player 1", RPSLSMogallapalli.RockPaperScissors("spock", "scissors"));
	}

	@Test
	void testSpockLizard() {
		assertEquals("Player 2", RPSLSMogallapalli.RockPaperScissors("spock", "lizard"));
	}

	@Test
	void testSpockSpock() {
		assertEquals("Tie", RPSLSMogallapalli.RockPaperScissors("spock", "spock"));
	}
}
