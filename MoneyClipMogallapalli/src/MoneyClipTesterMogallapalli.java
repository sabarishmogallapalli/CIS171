import java.time.LocalDate;

import cards.Card;
import cards.EmployeeBadge;
import cards.GymMembership;
import cards.StudentAccess;
import moneyclip.MoneyClip;


public class MoneyClipTesterMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card("John");
		EmployeeBadge e = new EmployeeBadge("John", "IA50234");
		StudentAccess s = new StudentAccess("John", "0098745", LocalDate.of(2022, 6, 18));
		GymMembership g = new GymMembership("John", "3045691937");
		
		MoneyClip mc = new MoneyClip();
		mc.addCard(g);
		mc.addCard(e);
		MoneyClip m = new MoneyClip(g, e);
		
		StudentAccess dl = new StudentAccess("Kelly", "1FQU731", LocalDate.of(2001, 4, 2));
		StudentAccess dl2 = new StudentAccess("Han", "8HYG9", LocalDate.of(2024, 2, 13));
		
		EmployeeBadge me = new EmployeeBadge("Kelli", "1QZQESW"); 
		EmployeeBadge friend = new EmployeeBadge("Kelli", "1QF3AW"); 
		
		System.out.println(me.equals(friend)); 
		System.out.println(dl.format()); 
		System.out.println("Is it expired: " + dl.isExpired());    
		System.out.println(dl2.format()); 
		System.out.println("Is it expired: " + dl2.isExpired()); 
		System.out.println(mc.displayContents());
		System.out.println(m.displayContents());
		System.out.println(c.format());
		System.out.println(e.format());
		System.out.println(s.format());
		System.out.println(g.format());
		
		EmployeeBadge e1 = new EmployeeBadge("Dwight", "IL67845");
		EmployeeBadge e2 = new EmployeeBadge("Jim", "PS87623");
		StudentAccess s1 = new StudentAccess("Dwight", "0973892", LocalDate.of(2022, 3, 9));
		StudentAccess s2 = new StudentAccess("Jim", "9090487", LocalDate.of(2022, 4, 3));
		GymMembership g1 = new GymMembership("Dwight", "4134580826");
		GymMembership g2 = new GymMembership ("Jim", "2934580826");
		MoneyClip m1 = new MoneyClip(e1, s2);
		MoneyClip m2 = new MoneyClip(e2, g1);
		MoneyClip m3 = new MoneyClip(s1, g2);
		System.out.println(m1.displayContents());
		System.out.println(m2.displayContents());
		System.out.println(m3.displayContents());
		System.out.println(e1.equals(e2));
		
		
		
	}

}
