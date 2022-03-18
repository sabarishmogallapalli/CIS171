import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 15, 2022  
*/

class BagelBonusMogallapalliTest {

	@Test
	void OneCoffeeReward() {
		assertEquals(1,BagelBonusMogallapalli.CoffeeRewards(30.00));
	}
	@Test
	void TwoCoffeeReward() {
		assertEquals(2,BagelBonusMogallapalli.CoffeeRewards(75.00));
	}
	@Test
	void ThreeCoffeeReward() {
		assertEquals(3,BagelBonusMogallapalli.CoffeeRewards(125.00));
	}
	@Test
	void OneDiscountCoupon() {
		assertEquals(0,BagelBonusMogallapalli.DiscountCouponCalculator(19.00));
	}
	@Test
	void TwoDiscountCoupon() {
		assertEquals(0.05,BagelBonusMogallapalli.DiscountCouponCalculator(25.05));
	}
	@Test
	void ThreeDiscountCoupon() {
		assertEquals(0.07,BagelBonusMogallapalli.DiscountCouponCalculator(40.02));
	}
	@Test
	void FourDiscountCoupon() {
		assertEquals(0.09,BagelBonusMogallapalli.DiscountCouponCalculator(100.00));
	}
	@Test
	void FiveDiscountCoupon() {
		assertEquals(0.12,BagelBonusMogallapalli.DiscountCouponCalculator(160.20));
	}
}
