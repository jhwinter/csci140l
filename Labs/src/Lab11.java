import java.util.Scanner;

/**
 * This program allows the user to input a number for n, then displays the sum.
 * The program uses printf statements to display the sum from each of the 3
 * types of loops in a table format. October 13, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // create the scanner

		// prompt the user for input
		System.out.print("Please enter a number: ");
		int lastN = in.nextInt(); // user input = lastN

		System.out.printf("%-11s%-11s%-10s\n", "For", "While", "Do-While");

		int n1 = 0; // declare and initialize n
		int sum1; // declare sum1

		// initialize sum1, increment n1 until n1 <= lastN
		for (sum1 = 0; n1 <= lastN; n1++) {
			sum1 = sum1 + n1; // add n1 to the sum of the previous integers
		}

		int n2 = 0; // declare and initialize n2
		int sum2 = 0; // declare and initialize sum2
		while (n2 < lastN) // while n < user input
		{
			n2++; // increment n
			sum2 = sum2 + n2; // add n2 to the sum of the previous integers
		}

		int n3 = 0; // declare and initialize n3
		int sum3 = 0; // declare and initialize sum3
		do {
			n3++; // increment n
			sum3 = sum3 + n3; // add n3 to the sum of the previous integers
		} while (n3 < lastN);
		// format the output of the sums
		System.out.printf("%-10d %-10d %-10d", sum1, sum2, sum3);

		in.close(); // close the scanner
	}
}
