import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SayThankYouTest {

	@Test
	void testSayThanksString() {
		assertEquals("Thanks, Mac", SayThankYou.sayThanks("Mac"));
	}
	@Test
	void testSayThanksStringString() {
		assertEquals("Thank you, Dennis Reynolds", SayThankYou.sayThanks("Dennis", "Reynolds"));
	}
	@Test
	void testSayStringStringString() {
		assertEquals("Thank you so much, Sir Charlie Kelly", SayThankYou.sayThanks("Sir", "Charlie", "Kelly"));
	}

}
