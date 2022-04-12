package cards;
import java.time.LocalDate;

public class StudentAccess extends Card {
	private String studentNumber;
	private LocalDate expirationDate;
	public StudentAccess(String name, String studentNumber, LocalDate expirationDate) {
		super(name);
		this.studentNumber = studentNumber;
		this.expirationDate = expirationDate;
	}
	public StudentAccess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String format() {   
		return super.format() + ", Student Number: " + studentNumber + ", ExpirationDate: " + expirationDate;  
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	} 
	
	@Override
	public boolean isExpired() {
		LocalDate currentDate = LocalDate.now();
		LocalDate accessCardExpiredDate = this.getExpirationDate();
		if (accessCardExpiredDate.isBefore(currentDate)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + ((studentNumber == null) ? 0 : studentNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentAccess other = (StudentAccess) obj;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		if (studentNumber == null) {
			if (other.studentNumber != null)
				return false;
		} else if (!studentNumber.equals(other.studentNumber))
			return false;
		return true;
	}

}
