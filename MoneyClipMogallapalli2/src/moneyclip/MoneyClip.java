package moneyclip;
import cards.Card;

public class MoneyClip {
	private Card slot1; 
	private Card slot2;
	public MoneyClip() {
		super();
	}
	public MoneyClip(Card slot1, Card slot2) {
		super();
		this.slot1 = slot1;
		this.slot2 = slot2;
	}
	public Card getSlot1() {
		return slot1;
	}
	public void setSlot1(Card slot1) {
		this.slot1 = slot1;
	}
	public Card getSlot2() {
		return slot2;
	}
	public void setSlot2(Card slot2) {
		this.slot2 = slot2;
	} 
	
	public void addCard(Card newCard) {
		if(slot1 == null) {
			slot1 = newCard;
		} else if(slot2 == null){
			slot2 = newCard;   
		}  
	} 
	
	public String displayContents() {  
		return "Slot 1: " + slot1.format() + " | Slot 2: " + slot2.format(); 
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((slot1 == null) ? 0 : slot1.hashCode());
		result = prime * result + ((slot2 == null) ? 0 : slot2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoneyClip other = (MoneyClip) obj;
		if (slot1 == null) {
			if (other.slot1 != null)
				return false;
		} else if (!slot1.equals(other.slot1))
			return false;
		if (slot2 == null) {
			if (other.slot2 != null)
				return false;
		} else if (!slot2.equals(other.slot2))
			return false;
		return true;
	} 
}
