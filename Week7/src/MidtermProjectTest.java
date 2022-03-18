import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 1, 2022
 */

class MidtermProjectTest {

	@Test
	void testA() {
		assertEquals(true, MidtermProject.getArithmeticOperator("a"));
	}

	@Test
	void testS() {
		assertEquals(true, MidtermProject.getArithmeticOperator("s"));
	}

	@Test
	void testM() {
		assertEquals(true, MidtermProject.getArithmeticOperator("m"));
	}

	@Test
	void testD() {
		assertEquals(true, MidtermProject.getArithmeticOperator("d"));
	}

	@Test
	void testAddition() {
		assertEquals(14, MidtermProject.additionOperation(8, 3, 2));
	}

	@Test
	void testSubtraction() {
		assertEquals(2, MidtermProject.subtractionOperation(8, 3, 2));
	}

	@Test
	void testMultiplication() {
		assertEquals(64, MidtermProject.multiplicationOperation(8, 3, 2));
	}

	@Test
	void testDivisio() {
		assertEquals(1, MidtermProject.divisionOperation(8, 3, 2));
	}

}
