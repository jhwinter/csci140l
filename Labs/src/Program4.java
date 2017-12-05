import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement a method:
 * 
 * public static void discount(double[] prices, boolean[] isPet)
 * 
 * The method receives information about a particular sale. For the ith item,
 * prices[i] is the price before any discount, and isPet[i] is true if the item
 * is a pet.
 * 
 * Write a program that prompts a cashier to enter each price and then a Y for a
 * pet or N for another item. Use a price of –1 as a sentinel. Save the inputs
 * in two parallel arrays -- one for the item's price and another to indicate if
 * the item is a pet. Call the method that you implemented, and have it display
 * the subtotal, discount, and total.
 * 
 * November 13, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Program4 {

	public static int item = 0; // declare and initialize item

	/**
	 * The entry point of the program
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // create a scanner
		boolean exit = false; // create a boolean variable

		final int SIZE = 3; // minimum size of each array
		double[] prices = new double[SIZE]; // declare and initialize prices
		boolean[] isPet = new boolean[SIZE]; // declare and initialize isPet

		/*
		 * while exit is false, program will continue to grow the arrays as
		 * needed and as long as the user input does not equal to -1, the
		 * program will continue to run
		 */
		while (exit == false) {
			System.out.print("Price: "); // ask for user input
			double price1 = in.nextDouble();
			in.nextLine(); // consumes the new line character
			// grows the array as needed
			/*
			 * if item >= the length of the prices array, then increase both
			 * prices and isPet by 1
			 */
			if (item >= prices.length) {
				prices = Arrays.copyOf(prices, prices.length + 1);
				isPet = Arrays.copyOf(isPet, isPet.length + 1);
			}

			/*
			 * if the user enters -1, exit will change from false to true
			 * causing the program to exit
			 */
			if (price1 != -1) {
				System.out.print("Pet (Y/N): ");

				/*
				 * If the user input is "y", then the true value is stored in
				 * whatever place item is at in the isPet array. If the user
				 * input is anything else, then the false value is stored in
				 * whatever place item is at in the isPet array.
				 */
				if (in.nextLine().equals("y")) {
					isPet[item] = true;
				} else {
					isPet[item] = false;
				}

				prices[item] = price1;
				item++;
			} else {
				exit = true;
			}
		}

		in.close(); // close the scanner

		// call to the discount method passing in both prices and isPet
		discount(prices, isPet);
	}

	/**
	 * Calculates and shows the discount, subtotal, and total.
	 * 
	 * @param prices
	 *            the array containing the items' prices.
	 * @param isPet
	 *            the array which says if the item in the ith position is a pet
	 *            (true)
	 */
	public static void discount(double[] prices, boolean[] isPet) {
		item--;// decrement item

		double subtotal = 0; // declare and initialize subtotal
		double discount = 0; // declare and initialize discount

		/*
		 * for each number in prices, each number will be added to the subtotal
		 */
		for (double num : prices) {
			subtotal = subtotal + num;
		}

		// print and format subtotal
		System.out.printf("Subtotal: $%.2f\n", subtotal);

		int pets = 0; // declare and initialize pets
		// for each true in the array isPet, both the number of pets and i
		// increments
		for (int i = 0; i < item; i++) {
			if (isPet[i] == true) {
				pets++;
			}
		}
		// items = the total number of items purchased minus the number of pets
		int items = item - pets;
		/*
		 * if items >= 4 and pets > 0, then the for loop will increment i which
		 * will perform the calculations for the discount as long as isPet[i] is
		 * true
		 */
		if (items >= 4 && pets > 0) {
			for (int i = 0; i <= item; i++) {
				if (isPet[i] == true) {
					discount = discount + (prices[i] * .2);
				}
			}
		}

		// print discount and total
		System.out.printf("Discount: $%.2f\n", discount);
		System.out.printf("Total: $%.2f", (subtotal - discount));
	}
}
