import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 14, 2022  
*/

class RockPaperScissorsMogallapalliTest {

	@Test
	void testSpockScissors() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("spock","scissors"));
	}
	@Test
	void testSpockRock() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("spock", "rock"));
	}
	@Test
	void testSpockPaper() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("spock", "paper"));
	}
	@Test
	void testSpockLizard() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("spock", "lizard"));
	}
	@Test
	void testScissorsPaper() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("scissors", "paper"));
	}
	@Test
	void testScissorsLizard() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("scissors", "lizard"));
	}
	@Test
	void testScissorsSpock() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("scissors", "spock"));
	}
	@Test
	void testScissorsRock() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("scissors", "rock"));
	}
	@Test
	void testPaperSpock() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("paper", "spock"));
	}
	@Test
	void testPaperRock() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("paper", "rock"));
	}
	@Test
	void testPaperScissors() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("paper", "scissors"));
	}
	@Test
	void testPaperLizard() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("paper", "lizard"));
	}
	@Test
	void testRockScissors() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("rock", "scissors"));
	}
	@Test
	void testRockLizard() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("rock", "lizard"));
	}
	@Test
	void testRockSpock() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("rock", "spock"));
	}
	@Test
	void testRockPaper() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("rock", "paper"));
	}
	@Test
	void testLizardSpock() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("lizard", "spock"));
	}
	@Test
	void testLizardPaper() {
		assertEquals("Player 1",RockPaperScissorsMogallapalli.RockPaperScissors("lizard", "paper"));
	}
	@Test
	void testLizardScissors() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("lizard", "scissors"));
	}
	@Test
	void testLizardRock() {
		assertEquals("Player 2",RockPaperScissorsMogallapalli.RockPaperScissors("lizard", "rock"));
	}
}
