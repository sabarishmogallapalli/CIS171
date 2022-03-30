
/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Mar 29, 2022  
*/
public class Classroom {
	private String building;
	private String roomNumber;
	private String campus;
	private String type;
	private int capacity;
	
	public Classroom() {
		setBuilding("5");
		setRoomNumber("4a");
		setCampus("Waukee");
		setType("Classroom");
		setCapacity(30);
		
	}
	
	public Classroom(String building, String roomNumber,String campus, String type, int capacity) {
		setBuilding(building);
		setRoomNumber(roomNumber);
		setCampus(campus);
		setType(type);
		setCapacity(capacity);
	}
	
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String toString() {
		String courseRegistration = "Building: " + this.getBuilding() + "\nRoom Number: " + this.getRoomNumber() + "\nCampus: " + this.getCampus() + "\nType: " + this.getType() + "\nCapacity: " + this.getCapacity();
		return courseRegistration;
	}
	
	
}
