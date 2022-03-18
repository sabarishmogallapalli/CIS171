import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 7, 2022
 */

class ArrayCheckMogallapalliTest {

	@Test
	void testHighest() {

		int[] testArray = { 0, 1, 2, 3, 4 };

		assertEquals(4, ArrayCheckMogallapalli.highestElement(testArray));
	}

	@Test
	void testLowest() {

		int[] testArray = { 0, 1, 2, 3, 4 };

		assertEquals(0, ArrayCheckMogallapalli.lowestElement(testArray));
	}

}
