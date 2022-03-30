import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Mar 29, 2022  
*/
class RegistrationTesterMogallapalli {

	@Test
	void test() {
		Classroom compSciLab = new Classroom("8", "17", "Ankeny", "Computer Lab", 20);
		assertEquals("8", compSciLab.getBuilding());
		assertEquals("17", compSciLab.getRoomNumber());
		assertEquals("Ankeny", compSciLab.getCampus());
		assertEquals("Computer Lab", compSciLab.getType());
		assertEquals(20, compSciLab.getCapacity());
		
	}

}
