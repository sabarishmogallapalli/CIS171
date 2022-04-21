/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* 4/19/22
*/ 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicketCounterTest {
	
	 TicketCounter orderSample = new TicketCounter();
	 

	@Test
	void lowRange() {
		assertEquals( false, orderSample.inRange(0));
	}
	@Test
	void highRange() {
		assertEquals(false, orderSample.inRange(5));
	}
	@Test
	void withinRange() {
		assertEquals(true, orderSample.inRange(3));
	}
	@Test
	void yesTickets() {
		assertEquals(true, orderSample.hasTickets(3));
	}
	@Test
	void noTickets() {
		assertEquals(false, orderSample.hasTickets(29));
	}
	@Test
	void purchaseBuyersandTickets() {
		orderSample.ticketsLeft(3);
		assertEquals(1,orderSample.getNumBuyers());
		assertEquals(25,orderSample.getAvailableTickets());
	}

}
