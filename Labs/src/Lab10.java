import java.util.Scanner; // import the scanner

/**
 * Program computes 1 + 2 + 3 +... + n where n is any positive integer. Design
 * your program to where the user can input a number for n, then display the
 * sum. Program terminates upon input of the sentinel value (-1).
 * October 8, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // create the scanner

		// prompt the user for input
		System.out.print("Please enter a number (-1 to quit): ");
		int lastN = in.nextInt(); // user input = lastN

		int sum = 0; // declare and initialize sum
		int n = 0; // declare and initialize n

		while (lastN != -1) {
			while (n < lastN) // while n < user input
			{
				n++; // increment n
				sum = sum + n; // add n to the sum of the previous integers
			}
			System.out.println("Sum: " + sum); // print sum
			// prompt the user for input
			System.out.print("Please enter a number (-1 to quit): ");
			lastN = in.nextInt(); // user input = lastN
		}

		in.close(); // close the scanner
	}

}
