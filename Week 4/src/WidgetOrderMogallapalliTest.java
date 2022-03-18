import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 8, 2022  
*/

class WidgetOrderMogallapalliTest {

	/**
	 * Test method for {@link WidgetOrderMogallapalli#orderTotal(int)}.
	 */
	@Test
	void testOrderTotal1() {
		assertEquals(48.87, WidgetOrderMogallapalli.orderTotal(5),0.01);
	}
	@Test
	void testOrderTotal2() {
		assertEquals(78.19, WidgetOrderMogallapalli.orderTotal(8),0.01);
	}
	@Test
	void testOrderTotal3() {
		assertEquals(97.74, WidgetOrderMogallapalli.orderTotal(10),0.01);
	}

}
