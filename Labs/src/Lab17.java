import java.util.Scanner;

/**
 * Write a function called bitsToHex that is passed a byte with an integer value
 * from 0 to 15 and returns a String that contains a hex digit equivalent to the
 * passed value. For example, if the byte contains a decimal 12, the method
 * returns the String "C", and if the byte contains a decimal 9, the method
 * returns the String "9". A byte is the smallest unit of storage in Java. By
 * limiting ourselves to the range 0 to 15, we know that the leftmost four bits
 * in the byte are all 0's. So, if we create a byte with value 13, the contents
 * of the byte in binary is 00001101 and our bitsToHex method will return "D".
 * November 3, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab17 {
	/**
	 * Entry point for the program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // create a scanner
		// declare and initialize the variable "value"
		byte value;
		// while 0 > value or value > 15, keep prompting the user for input
		do {
			System.out.print("Please enter an integer value from 0-15: ");
			value = in.nextByte();
		} while (value < 0 || value > 15);

		System.out.print("Hex: " + bitsToHex(value));
		// print the value in hex

		in.close(); // close the scanner
	}

	/**
	 * Converts a value between 0 and 15 to its hexadecimal representation
	 * 
	 * @param value
	 *            the value to be converted
	 * @return the hexadecimal representation
	 */
	public static String bitsToHex(byte value) {
		switch (value) {
		case 0:
			return "0";
		case 1:
			return "1";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		default:
			return "";
		}
	}
}
