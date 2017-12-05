import java.util.ArrayList;
import java.util.Scanner;

/**
 * A supermarket wants to reward it's best customer of each day by showing the
 * customer's name on a screen in the supermarket. For that purpose, the
 * customer's purchase amount is stored in an ArrayList<Double> and the
 * customer's name is stored in a corresponding ArrayList<String>.
 * 
 * Implement a method:
 * 
 * public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList
 * <String> customers)
 * 
 * that returns the name of the customer with the largest sale.
 * 
 * --
 * 
 * Write a program that prompts the cashier to enter all prices and names, adds
 * them to two parallel array lists (one for sales and one for customer names),
 * calls the method that you implemented, and displays the result. Use a price
 * of 0 as a sentinel.
 * 
 * November 19, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class ProgramExam2 {

	/**
	 * Entry point of program
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to ABC Supermarket!");
		System.out.println("Please enter total sale prices followed by the customer's name.");

		ArrayList<Double> sales = new ArrayList<Double>();
		ArrayList<String> customers = new ArrayList<String>();		
		System.out.print("Total Price: ");
		double price = in.nextDouble();
		sales.add(price);
		do {
			System.out.print("Customer name: ");
			String name = in.next();
			customers.add(name);
			System.out.print("Total Price: ");
			price = in.nextDouble();
			sales.add(price);
		}while(price != 0);
		
		in.close();
		System.out.print("The customer with the highest sale was: ");
		System.out.print(nameOfBestCustomer(sales, customers));
	}

	/**
	 * finds the largest input and uses the index from that one to print out the proper index from customer names
	 * @param sales array list of prices inputted
	 * @param customers array list of names inputted
	 * @return name of the customer with the highest sale
	 */
	public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers) {
		
		int i = 0;
		int largestIndex = 0;
		double largest = sales.get(0);
		for (i = 1; i < sales.size(); i++) {
			if (sales.get(i) > largest) {
				largestIndex = i;
				largest = sales.get(i);		
			}
		}
		String bestCustomerName = customers.get(largestIndex);
		return bestCustomerName;
	}
}