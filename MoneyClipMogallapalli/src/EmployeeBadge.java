
public class EmployeeBadge extends Card {
	public EmployeeBadge(String name, String badgeNumber) {
		super(name);
		this.badgeNumber = badgeNumber;
	}

	public EmployeeBadge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeBadge(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String badgeNumber;

	public String getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	
	public String format() {
		return super.format() + ", Badge Number: " + badgeNumber; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((badgeNumber == null) ? 0 : badgeNumber.hashCode());
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
		EmployeeBadge other = (EmployeeBadge) obj;
		if (badgeNumber == null) {
			if (other.badgeNumber != null)
				return false;
		} else if (!badgeNumber.equals(other.badgeNumber))
			return false;
		return true;
	} 
}
