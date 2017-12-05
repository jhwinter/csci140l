import java.util.Scanner;

/**
 * The following pseudocode describes how a bookstore computes the price of an
 * order from the total price and the number of the books that were ordered.
 * 
 * Read the total book price and the number of books 
 * Compute the tax (7.5% of the total book price) 
 * Compute the shipping charge ($2 per book) 
 * The price of the order is the sum of the total book price, the tax, and the shipping charge 
 * Print the price of the order
 * 
 * @author jtwinters
 *
 */
public class ChapterQuiz {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Total book price: ");
		double bookPrice = in.nextDouble();
		
		Scanner in1 = new Scanner(System.in);
		System.out.print("Total # of books: ");
		int numBooks = in.nextInt();
		
		double tax = bookPrice * .075;
		
		int shipCharge = numBooks * 2;
		
		double price = bookPrice + tax + shipCharge;
		
		System.out.printf("Order total: $%.2f", price);
		
		in.close();
		
		
		
		
		
		
		
		
	}
}