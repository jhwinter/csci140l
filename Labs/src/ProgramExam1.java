import java.util.Scanner;

/**
 * The ABC Manufacturing Company wants a program that reads in the name and
 * salary of an employee. Here the salary will denote an hourly wage, such as
 * $9.25. Then ask how many hours the employee worked in the past week. Be sure
 * to accept fractional hours. Compute the pay. Any overtime work (over 40 hours
 * per week) is paid at 150 percent of the regular wage. Print a paycheck for
 * the employee. Use printf statements to line up the output into 3 columns
 * (Name, Hours, and Pay). October 1, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class ProgramExam1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // created a scanner

		System.out.print("Please enter the employee name: ");
		String name = in.nextLine(); // Scanner reads in employee's name
		System.out.print("Please enter an hourly wage: ");
		double wage = in.nextDouble(); // Scanner reads in hourly wage
		System.out.print("Please enter the number of hours worked: ");
		double hours = in.nextDouble(); // Scanner reads in number of hours
										// worked

		System.out.println("\nABC Manufacturing Company");
		System.out.printf("%-8s%-11s%-10s\n", "Name", "Hours", "Pay");
		// formatted the columns for Name, Hours, and Pay
		double pay; // declared a variable

		if (hours > 40) {

			double otWage = wage * 1.50; // overtime wage = wage multiplied by
											// 150 percent
			double otHours = hours - 40;
			otWage = otWage * otHours; // overtime wage = overtime wage
										// multiplied by overtime hours
			pay = wage * 40 + otWage; // pay = wage * hours + overtime wage

		} else {
			pay = wage * hours; // pay = wage * hours
		}

		System.out.printf("%-7s %-10.2f $%-10.2f", name, hours, pay);
		// formatted the name, hours, and pay variables

		in.close(); // closed the scanner
	}

}
