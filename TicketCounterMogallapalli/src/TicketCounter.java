/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* 4/19/22
*/ 

public class TicketCounter {



	private static int availableTickets = 28;

    public static void setAvailableTickets(int availableTickets) {
		TicketCounter.availableTickets = availableTickets;
	}


	private int numBuyers = 0;

    int maxTickets = 4;

    int minTickets = 1;


    public int getAvailableTickets() {

        return availableTickets;

    }

    public int getNumBuyers() {

        return numBuyers;

    }

	public void setNumBuyers(int numBuyers) {
		this.numBuyers = numBuyers;
	}


    public String repeatOrder() {

        String order = "Number of buyers: " + this.getNumBuyers() + "\n Tickets left over: " + this.getAvailableTickets();

        return order;

    }


    public Boolean inRange(int ticketsPurchased) {

        return minTickets <= ticketsPurchased && ticketsPurchased <= maxTickets;

    }


    public Boolean hasTickets(int ticketsPurchased) {

        return availableTickets > ticketsPurchased;

    }


    public void ticketsLeft(int ticketsPurchased) {
        if (inRange(ticketsPurchased) && availableTickets > 0) {

            availableTickets -= ticketsPurchased;

            numBuyers++;
        }


    }

}