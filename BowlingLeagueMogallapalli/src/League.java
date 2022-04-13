import java.time.LocalTime;
import java.util.ArrayList;

public class League {
private String alleyName;
private String address;
private String dayOfWeek;
private LocalTime startTime;
private ArrayList<Team> listOfTeams;

public League() {
	this.alleyName = "Peter's Pins";
	this.address = "10435 Pins Lane, Clive, IA 50325";
	this.dayOfWeek = "Wednesday";
	this.startTime = LocalTime.of(5, 30);
	listOfTeams = new ArrayList<Team>();
}

public League(String alleyName, String address, String dayOfWeek, LocalTime startTime, ArrayList<Team> listOfTeams) {
	super();
	this.alleyName = alleyName;
	this.address = address;
	this.dayOfWeek = dayOfWeek;
	this.startTime = startTime;
	this.listOfTeams = listOfTeams;
}

public String getAlleyName() {
	return alleyName;
}
public void setAlleyName(String alleyName) {
	this.alleyName = alleyName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDayOfWeek() {
	return dayOfWeek;
}
public void setDayOfWeek(String dayOfWeek) {
	this.dayOfWeek = dayOfWeek;
}
public LocalTime getStartTime() {
	return startTime;
}
public void setStartTime(LocalTime startTime) {
	this.startTime = startTime;
}
public ArrayList<Team> getListOfTeams() {
	return listOfTeams;
}
public void setListOfTeams(ArrayList<Team> listOfTeams) {
	this.listOfTeams = listOfTeams;
}

public League duplicateLeagueForNextSession() {
	League abc = new League(this.alleyName, this.address, this.dayOfWeek, this.startTime, this.listOfTeams);
	abc.startTime = abc.startTime.minusHours(1);
	return abc;
}

public String repeatLeague() {
	String order =  "The alley name is: " + this.getAlleyName() +  ". It is located at " + this.getAddress() + ". It opens on " + this.getDayOfWeek() + " at " + this.getStartTime() + " pm.";
	return order;
}

@Override
public String toString() {
	return "League [alleyName=" + alleyName + ", address=" + address + ", dayOfWeek=" + dayOfWeek + ", startTime="
			+ startTime + ", listOfTeams=" + listOfTeams + "]";
}
}
