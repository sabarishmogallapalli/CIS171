import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 8, 2022  
*/

class CompoundInterestMogallapalliTest {

	/**
	 * Test method for {@link CompoundInterestMogallapalli#computeBalance(double, double, double)}.
	 */
	@Test
	void testComputeBalance1() {
		assertEquals(17721.96, CompoundInterestMogallapalli.computeBalance(10000, .045, 13),0.01);
	}
	@Test
	void testComputeBalance2() {
		assertEquals(31159.35, CompoundInterestMogallapalli.computeBalance(20000, .03, 15),0.01);
	}
	@Test
	void testComputeBalance3() {
		assertEquals(36605.70, CompoundInterestMogallapalli.computeBalance(30000, .01, 20),0.01);
	}

}
