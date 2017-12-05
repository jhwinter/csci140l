import java.util.Scanner;

/**
 * A program that takes an integer and converts it to it's string rep.
 * 
 * @author jtwinters
 *
 */
public class IntConversion {

	/**
	 * Entry point for program
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = in.nextInt();

		System.out.println(intName(num));
		
		in.close();
	}

	/**
	 * Converts an integer into a String representation
	 * @param num integer to convert
	 * @return String representation of number
	 */
	public static String intName(int num) {
		int part = num;
		String name = "";

		if (part >= 100) {
			int digit = part / 100;
			name = getDigit(digit) + " hundred";
			part = part % 100;
		}
		if (part >= 20) {
			int digit = part / 10;
			name = name + " " + tensName(digit);
			part = part % 10;
		} else if (part >= 10) {
			name = name + " " + teensName(part);
		}
		if (part > 0) {
			name = name + " " + getDigit(part);
		}
		return name;
	}

	/**
	 * Converts a teen value (10 - 19) to a String
	 * @param num teen value to convert
	 * @return String representation of num
	 */
	public static String teensName(int num) {
		switch (num) {
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		default:
			return "";
		}
	}

	/**
	 * Converts a multiple of ten to a String
	 * @param num multiple of ten to convert
	 * @return String representation of num
	 */
	public static String tensName(int num) {
		switch (num) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "forty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		default:
			return "";
		}
	}
	
	/**
	 * Converts a digit into a String
	 * @param num digit to convert
	 * @return String representation of num
	 */
	public static String getDigit(int num) {
		switch (num) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "";
		}
	}
}
