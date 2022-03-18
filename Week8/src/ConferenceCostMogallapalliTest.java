import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 7, 2022
 */

class ConferenceCostMogallapalliTest {

	@Test
	void oneOne() {
		assertEquals(100, ConferenceCostMogallapalli.determineConferenceCost(1, 1));
	}

	@Test
	void oneTwo() {
		assertEquals(190, ConferenceCostMogallapalli.determineConferenceCost(1, 2));
	}

	@Test
	void oneThree() {
		assertEquals(270, ConferenceCostMogallapalli.determineConferenceCost(1, 3));
	}

	@Test
	void oneFour() {
		assertEquals(340, ConferenceCostMogallapalli.determineConferenceCost(1, 4));
	}

	@Test
	void oneFive() {
		assertEquals(400, ConferenceCostMogallapalli.determineConferenceCost(1, 5));
	}

	@Test
	void twoOne() {
		assertEquals(90, ConferenceCostMogallapalli.determineConferenceCost(2, 1));
	}

	@Test
	void twoTwo() {
		assertEquals(170, ConferenceCostMogallapalli.determineConferenceCost(2, 2));
	}

	@Test
	void twoThree() {
		assertEquals(250, ConferenceCostMogallapalli.determineConferenceCost(2, 3));
	}

	@Test
	void twoFour() {
		assertEquals(320, ConferenceCostMogallapalli.determineConferenceCost(2, 4));
	}

	@Test
	void twoFive() {
		assertEquals(380, ConferenceCostMogallapalli.determineConferenceCost(2, 5));
	}

	@Test
	void threeOne() {
		assertEquals(85, ConferenceCostMogallapalli.determineConferenceCost(3, 1));
	}

	@Test
	void threeTwo() {
		assertEquals(160, ConferenceCostMogallapalli.determineConferenceCost(3, 2));
	}

	@Test
	void threeThree() {
		assertEquals(240, ConferenceCostMogallapalli.determineConferenceCost(3, 3));
	}

	@Test
	void threeFour() {
		assertEquals(310, ConferenceCostMogallapalli.determineConferenceCost(3, 4));
	}

	@Test
	void threeFive() {
		assertEquals(370, ConferenceCostMogallapalli.determineConferenceCost(3, 5));
	}

	@Test
	void fourOne() {
		assertEquals(75, ConferenceCostMogallapalli.determineConferenceCost(4, 1));
	}

	@Test
	void fourTwo() {
		assertEquals(150, ConferenceCostMogallapalli.determineConferenceCost(4, 2));
	}

	@Test
	void fourThree() {
		assertEquals(230, ConferenceCostMogallapalli.determineConferenceCost(4, 3));
	}

	@Test
	void fourFour() {
		assertEquals(300, ConferenceCostMogallapalli.determineConferenceCost(4, 4));
	}

	@Test
	void fourFive() {
		assertEquals(360, ConferenceCostMogallapalli.determineConferenceCost(4, 5));
	}

}
