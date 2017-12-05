import java.util.Scanner; // import scanner

/**
 * Program computes the greatest common divisor of two integers and prints it
 * out. October 15, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab12 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // create a scanner

		// prompt user for first input
		System.out.print("Enter the first integer: ");
		int x = in.nextInt(); // x = first user input
		System.out.println("x = " + x); // print x

		// prompt user for second input
		System.out.print("Enter the second integer: ");
		int y = in.nextInt(); // y = second user input
		System.out.println("y = " + y); // print y

		// declare and initialize variables x1 and y1
		int x1 = 0;
		int y1 = 0;

		// while x and y do not equal to 0 and while x and y are greater than 0,
		// program will continue
		while (x != 0 && y != 0 && x > 0 && y > 0) {
			/*
			 * if first user input is greater than or equal to second user input
			 * then subtract y from x and set the value equal to new x
			 */
			if (x >= y) {
				x1 = x - y;
			}
			/*
			 * if second user input is greater than first user input then
			 * subtract x from y and set the value equal to new y
			 */
			else {
				y1 = y - x;
			}
			// if new x is greater than new y, print new x as the GCD
			if (x1 > y1) {
				System.out.println("GCD(" + x + ", " + y + ") = " + x1);
			} // if new y is greater than new y, print new y as the GCD
			else if (y1 > x1) {
				System.out.println("GCD(" + x + ", " + y + ") = " + y1);
			} // if new x is equal to new y, print original x
			else {
				System.out.println("GCD(" + x + ", " + y + ") = " + x);
			}
			break;
		}

		// if user inputs 0 or a number less than 0,
		// then an error message will appear
		if (x <= 0 || y <= 0) {
			System.out.println("Invalid input. Please enter a positive integer.");
		}

		in.close(); // close scanner

	}
}
