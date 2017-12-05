import java.util.Scanner;

public class TicketSeller {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		final int MAX_TICKETS = 4;
		final int MIN_TICKETS = 1;
		int tickets = 100; // counter for # of tickets
		int buyers = 0; // counter variable for # of buyers

		while (tickets != 0) {
			System.out.print("How many tickets? ");
			int wantedTickets = in.nextInt();
			if (wantedTickets >= MIN_TICKETS && wantedTickets <= MAX_TICKETS
					&& wantedTickets <= tickets) {
				// good to sell!
				tickets -= wantedTickets;
				buyers++;
				System.out.printf("Tickets left: %d\n", tickets);
			} else {
				// invalid
				System.out.println("Invalid ticket amount!");
			}
		}
		System.out.println("SOLD OUT!");
		System.out.printf("Buyers: %d\n", buyers);
		in.close();
	}

}
