import java.util.Scanner; // import scanner

/**
 * Write a program that prints a paycheck. Ask the program user for the name of
 * the employee, the hourly rate, and the number of hours worked. If the number
 * of hours exceeds 40, the employee is paid "time and a half", that is, 150
 * percent of the hourly rate on the hours exceeding 40. Your check should look
 * similar to the attached sample execution. November 1, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Program3 {

	/**
	 * Entry point for program
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the employee name: ");
		String name = in.nextLine(); // Scanner reads in employee's name
		System.out.print("Please enter an hourly wage: ");
		double rate = in.nextDouble(); // Scanner reads in hourly rate
		System.out.print("Please enter the number of hours worked: ");
		double hours = in.nextDouble();
		// Scanner reads in number of hours worked
		in.close();

		// print the formatted check
		printCheck(name, rate, hours);

		// set pay = to the value returned from computePay
		double pay = computePay(rate, hours);
		int num = (int) pay; // cast pay as an int and set num equal to it

		/*
		 * multiply pay by 100 in order to get rid of the decimal place and then
		 * use Math.round to round pay to the nearest integer
		 */
		pay = pay * 100;
		pay = Math.round(pay);

		// cast pay as an integer and use modulo to get the decimal place from
		// pay
		int decimalPay = (int) pay % 100;

		// make /100 a string
		String hundred = "/100";
		System.out.println("\n" + intName(num) + " and " + decimalPay + hundred);
		// print out the written version of the amount paid
	}

	/**
	 * Prints a formatted paycheck
	 * 
	 * @param name
	 *            employee name
	 * @param rate
	 *            employee hourly rate
	 * @param hours
	 *            number of hours the employee worked
	 */
	public static void printCheck(String name, double rate, double hours) {
		System.out.println("\n\nPay to the order of: " + name);
		System.out.printf("%-50s %10s", "ABC Manufacturing", "Bank of XYZ");
		System.out.printf("\n\n%-25s%-31s%-5s\n", "Pay", "Date", "Amount");
		System.out.printf("%-24s %-30s $%-5.2f", name, "11/05/2015", computePay(rate, hours));
	}

	/**
	 * Computes the pay of a given rate and hours. Calculates overtime pay if
	 * hours is greater than 40.
	 * 
	 * @param rate
	 *            hourly rate for employee
	 * @param hours
	 *            number of hours the employee worked
	 * @return the correct payment for the hours and rate
	 */
	public static double computePay(double rate, double hours) {
		double pay;
		if (hours > 40) {

			double otRate = rate * 1.50; // overtime wage = wage multiplied by
			// 150 percent
			double otHours = hours - 40;
			otRate = otRate * otHours; // overtime wage = overtime wage
										// multiplied by overtime hours
			pay = rate * 40 + otRate; // pay = wage * hours + overtime wage

		} else {
			pay = rate * hours; // pay = wage * hours
		}
		return pay; // computePay returns whatever pay is
	}

	/**
	 * Converts an integer into a String representation
	 * 
	 * @param num
	 *            integer to convert
	 * @return String representation of number
	 */
	public static String intName(int num) {
		int part = num; // set part = num
		String name = ""; // set name = an empty string

		/*
		 * If part >= 100, then set digit equal to whatever number is in the
		 * hundreds place and set name equal to whichever switch case it
		 * corresponds to in the digitName method then get rid of the number in
		 * the hundreds place by using the modulo.
		 */
		if (part >= 100) {
			int digit = part / 100;
			name = digitName(digit) + " hundred";
			part = part % 100;
		}

		/*
		 * If part >= 20, then set digit equal to whatever number is in the tens
		 * place and set name equal to itself plus whichever switch case it
		 * corresponds to in the tensName method. Then get rid of the number in
		 * the tens place by using the modulo.
		 */
		if (part >= 20) {
			int digit = part / 10;
			name = name + " " + tensName(digit);
			part = part % 10;
		}

		/*
		 * If part >= 10, then set digit equal to whatever number is in the tens
		 * place and set name equal to itself plus whichever switch case it
		 * corresponds to in the teenName method.
		 */
		else if (part >= 10) {
			name = name + " " + teenName(part);
		}

		/*
		 * If part > 0, then set name equal to itself + whatever switch case it
		 * corresponds to in the digitName method.
		 */
		if (part > 0) {
			name = name + " " + digitName(part);
		}
		return name; // the intName method returns whatever name is

	}

	/**
	 * Converts a teen value (10 - 19) to a String
	 * 
	 * @param num
	 *            teen value to convert
	 * @return String representation of num
	 */
	public static String teenName(int num) {
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
	 * 
	 * @param num
	 *            multiple of ten to convert
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
	 * 
	 * @param num
	 *            digit to convert
	 * @return String representation of num
	 */
	public static String digitName(int num) {
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