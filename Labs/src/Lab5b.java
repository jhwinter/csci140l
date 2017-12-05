import java.util.Scanner;

/**
 * This program reads the total book price and the number of books. Computes the
 * tax (7.5% of the total book price). Computes the shipping charge ($2 per
 * book). The price of the order is the sum of the total book price, the tax,
 * and the shipping charge. Prints the price of the order.
 * 
 * September 3, 2015
 * 
 * @author Jonathan Winters
 */
public class Lab5b {

	public static void main(String[] args) {
		// create a scanner
		Scanner in = new Scanner(System.in);

		// ask the user for input
		System.out.print("Total book price: ");
		int totalBookPrice = in.nextInt(); // declare and initialize variable
		double bookTax = totalBookPrice * .075; // compute the tax

		System.out.print("Total # of books: "); // ask the user for input
		int totalBooks = in.nextInt(); // declare and initialize variable
		double shipCharge = totalBooks * 2; // compute the shipping charge

		// declare and initialize variable
		double orderTotal = totalBookPrice + bookTax + shipCharge;

		// print order total
		System.out.printf("Order Total: $%.2f ", orderTotal);
		
		in.close();
		
	}
}
