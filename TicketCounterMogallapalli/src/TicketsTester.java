/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* 4/19/22
*/ 
import java.util.Scanner;

public class TicketsTester {
    public static void main(String[] args) {
        TicketCounter orderOne = new TicketCounter();
        Scanner in = new Scanner(System.in);
        int ticketsPurchased;
        while (orderOne.getAvailableTickets() > 0) {
            System.out.println("Enter the amount of tickets you want to purchase. The maximum amount is 4.");
            ticketsPurchased = in.nextInt();
            while (!orderOne.inRange(ticketsPurchased)) {
                System.out.println("Number of tickets requested is not in required range, please try again and request an amount between 1 and 4");
                ticketsPurchased = in.nextInt();
            }
            if (orderOne.hasTickets(ticketsPurchased)) {
                System.out.println("The number of tickets requested are: " + ticketsPurchased);
                orderOne.ticketsLeft(ticketsPurchased);
            } else {
                System.out.println("The maximum number of tickets available are: " + orderOne.getAvailableTickets());
                System.out.println("Please enter valid number for available tickets: ");
                //ticketsPurchased = in.nextInt();
                if (orderOne.getAvailableTickets() > 0 && ticketsPurchased <= orderOne.getAvailableTickets()) {
                    orderOne.ticketsLeft(ticketsPurchased);
                }
            }
        }
        System.out.println("The number of buyers are: " + orderOne.getNumBuyers());
        in.close();
    }
}
