package cards;


public class GymMembership extends Card {
	public GymMembership() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GymMembership(String name, String cardNumber) {
		super(name);
		this.cardNumber = cardNumber;
	}

	public GymMembership(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String format() {
		return super.format() + ", Card Number: " + cardNumber;  
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
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
		GymMembership other = (GymMembership) obj;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		return true;
	}
}
