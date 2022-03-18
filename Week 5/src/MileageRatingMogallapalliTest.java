import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 15, 2022  
*/

class MileageRatingMogallapalliTest {

	@Test
	void OverForty() {
		assertEquals("Excellent",MileageRatingMogallapalli.mileageRatingScale(50));
	}
	@Test
	void UnderThirtyNine() {
		assertEquals("Good",MileageRatingMogallapalli.mileageRatingScale(35));
	}
	@Test
	void UnderTwentyNine() {
		assertEquals("Fair",MileageRatingMogallapalli.mileageRatingScale(25));
	}
	@Test
	void UnderTwenty() {
		assertEquals("Poor",MileageRatingMogallapalli.mileageRatingScale(15));
	}
}
