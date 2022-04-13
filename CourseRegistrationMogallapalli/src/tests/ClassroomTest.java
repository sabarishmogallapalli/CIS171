package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Classroom;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Mar 29, 2022  
*/
class ClassroomTest {
	Classroom compSciLab = new Classroom("8", "17", "Ankeny", "Computer Lab", 20);
	Classroom bioLab  = new Classroom("3", "28a", "Carroll", "Science Lab", 22);
	Classroom litRoom = new Classroom("Betts", "12", "Urban", "Classroom", 18);
	
	@Test
	public void testBuilding() {
		assertEquals("8", compSciLab.getBuilding());
	}
	
	@Test
	public void testNumber() {
		assertEquals("17", compSciLab.getRoomNumber());
	}
	
	@Test
	public void testCampus() {
		assertEquals("Ankeny", compSciLab.getCampus());
	}
	@Test
	public void testType() {
		assertEquals("Computer Lab", compSciLab.getType());
	}	
	@Test
	public void testCapacity() {
		assertEquals(20, compSciLab.getCapacity());
	}	

}
