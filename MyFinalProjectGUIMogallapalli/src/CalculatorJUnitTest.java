import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Calculator;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* May 3, 2022  
*/
class CalculatorJUnitTest {
	
	Calculator testCalc = new Calculator();

	@Test
	void testAddition() {
		assertEquals(14, testCalc.addTotal(8, 2, 3));
	}

	@Test
	void testSubtraction() {
		assertEquals(2, testCalc.subTotal(8, 2, 3));
	}

	@Test
	void testMultiplication() {
		assertEquals(64, testCalc.multiplyTotal(8, 2, 3));
	}

	@Test
	void testDivision() {
		assertEquals(1, testCalc.divideTotal(8, 2, 3));
	}
	//do for each of addition, subtraction, division, multiplication
	@Test
	void testNegativeStarting() {
		assertEquals(-2, testCalc.addTotal(-8, 2, 3));
	}
	@Test
	void testNegativeFactor() {
		assertEquals(2, testCalc.addTotal(8, -2, 3));
	}
	@Test
	void testNegativeTimes() {
		assertEquals(0, testCalc.addTotal(8, 2, -3));
	}
	
	

}
