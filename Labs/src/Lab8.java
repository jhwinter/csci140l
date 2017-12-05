import java.util.Scanner;

/**
 * Write a program that reads four integers and prints "two pairs" if the input
 * consists of two matching pairs (in some order) and "not two pairs" otherwise.
 * 
 * @author Jonathan Winters 
 * September 17, 2015
 */
public class Lab8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // create a scanner

		System.out.print("Please enter 4 numbers: "); // print out statement

		if (in.hasNextInt()) {
			int number1 = in.nextInt(); // declare and initialize variables
			int number2 = in.nextInt();
			int number3 = in.nextInt();
			int number4 = in.nextInt();

			if ((number1 == number2 && number3 == number4) || (number1 == number3 && number2 == number4)
					|| (number1 == number4 && number2 == number3)) {  // if all possible combinations of two pairs
				System.out.println("two pairs"); // then print "two pairs"
			} else {
				System.out.println("not two pairs"); // else print "not two pairs"
			}
			in.close(); // close the scanner
		}
	}

}