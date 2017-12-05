import java.util.Scanner; // import scanner

/**
 * Credit Card Number Check
 * 
 * The last digit of a credit card number is the check digit, which protects
 * against transcription errors such as an error in a single digit or switching
 * two digits. The following method is used to verify actual credit card numbers
 * but, for simplicity, we will describe it for numbers with 8 digits instead of
 * 16.
 * 
 * Starting from the rightmost digit, form the sum of every other digit. For
 * example, if the credit card number is 4358 9795, then you form the sum 5 + 7
 * + 8 + 3 = 23. Double each of the digits that were not included in the
 * preceding step. Add all the digits of the results numbers. For example, with
 * the number given above, doubling the digits, starting with the next-to-last
 * one, yields 18, 18, 10, and 8. Adding all digits in these values yields 1 + 8
 * + 1 + 8 + 1 + 0 + 8 = 27. Add the sum of the two preceding steps. If the last
 * digit of the result is 0, the number is valid. In our case 23 + 27 = 50, so
 * the number is valid. Write a program that implements this algorithm. The user
 * should supply an 8-digit number, and you should print out whether the number
 * is valid or not. If it is not valid, you should print the value of the check
 * digit that would make it valid. October 13, 2015
 * 
 * I used this source to help me solve this problem:
 * https://github.com/syndbg/Books-solutions/blob/master/Big-Java-for-Everyone-
 * Late-Objects-Horstmann/Chapter-4-Loops/P4_32.java
 * 
 * @author Jonathan Winters
 *
 */
public class Program2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // create a scanner

		// prompt user for input
		System.out.print("Please enter a credit card #: ");

		String ccNumber = in.next();
		in.close(); // close the scanner

		// add every other digit starting from the rightmost digit
		int sumDigits1 = Integer.parseInt(ccNumber.substring(7, 8)) + Integer.parseInt(ccNumber.substring(5, 6))
				+ Integer.parseInt(ccNumber.substring(3, 4)) + Integer.parseInt(ccNumber.substring(1, 2));

		// double all of the digits that were not including in the preceding
		// step
		int number1 = (Integer.parseInt(ccNumber.substring(6, 7)) * 2);
		int number2 = (Integer.parseInt(ccNumber.substring(4, 5)) * 2);
		int number3 = (Integer.parseInt(ccNumber.substring(2, 3)) * 2);
		int number4 = (Integer.parseInt(ccNumber.substring(0, 1)) * 2);

		// add all of the digits from the results numbers
		int sumDigits2 = (number1 % 10) + (number1 / 10) + (number2 % 10) + (number2 / 10) + (number3 % 10)
				+ (number1 / 10) + (number4 % 10) + (number4 / 10);

		// add the sum of the two preceding steps
		int validityCheck = sumDigits1 + sumDigits2;

		// if the last digit of the result is 0, the number is valid
		if (validityCheck % 10 == 0) {
			System.out.println("Valid!");
		} else {
			// if the last digit of the result is not 0, the number is not valid
			System.out.println("Invalid!");
			int checkDigit = 0;
			/*
			 * If the last digit in the credit card number minus the last digit
			 * of the validity check is less than 0, then the last digit in the
			 * credit card number plus 10 minus the last digit of the validity
			 * check is the check digit. If the last digit in the credit card
			 * number minus the last digit of the validity check is not less
			 * than 0, then the check digit is the last digit of the credit card
			 * number minus the last digit of the validity check.
			 */
			if ((Integer.parseInt(ccNumber.substring(7, 8))) - (validityCheck % 10) < 0) {
				checkDigit = (Integer.parseInt(ccNumber.substring(7, 8))) + (10 - (validityCheck % 10));
			} else {
				checkDigit = (Integer.parseInt(ccNumber.substring(7, 8))) - (validityCheck % 10);
			}
			// print the value of the check digit
			// that would make the number valid
			System.out.println("Check digit should be: " + checkDigit);
		}
	}
}
