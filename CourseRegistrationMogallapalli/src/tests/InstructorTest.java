package tests;
/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* April 19, 2022
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Instructor;

class InstructorTest {
	Instructor test = new Instructor();  
	@Test
	void testMakeEmailAddressLowerCase() {
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("kit", "cat")); 
		
	}
	
	@Test
	void testMakeEmailAddressUpperCase() {
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("KIT", "CAT")); 
		
	}

}
