import java.util.Scanner; // call for the scanner

/**
 * Write a static method called areaOfRectangle that is passed two
 * floating-point values for the length and width of a rectangle. The method
 * returns the product of the length and width as a double. Comment the method
 * using javadoc conventions. Write a main method that allows the user to input
 * a length and width for a rectangle and then outputs the rectangle's area.
 * Then prompt the user to see if they would like to enter more. If so -- repeat
 * the previous steps. If not -- end the program. Design your algorithm to
 * perform input validation to ensure that the user only enters 'Y', 'y', 'N',
 * or 'n'. If an invalid character is inputted, simply prompt the user again.
 * October 27, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab15 {

	/**
	 * Allows the user to input a length and width for a rectangle and then
	 * outputs the rectangle's area
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // created a scanner in

		// set the answer to Y by default
		String answer = "Y";
		// while answer = Y, the program will continue to run
		while ((answer.equals("Y"))) {
			// ask the user for the length of the rectangle
			System.out.print("Please enter a length: ");
			double length = in.nextDouble();
			// ask the user for the width of the rectangle
			System.out.print("Please enter a width: ");
			double width = in.nextDouble();

			// compute the area by calling from the areaOfRectangle method
			double area = areaOfRectangle(length, width);
			System.out.println("Area: " + area);
			// print what the area

			// ask the user if they would like to run the program again
			System.out.print("Enter more? (Y/N) ");
			answer = in.next().toUpperCase();
			// convert all answers to uppercase

			// if user inputs an "N", exit the program
			if (answer.equals("N")) {
				System.exit(0);
			}
			/*
			 * while answer does not equal to "Y" and "N", the program will
			 * continue to ask if they would like to run the program again
			 */
			while (!answer.equals("Y") && !answer.equals("N")) {
				System.out.print("Enter more? (Y/N) ");
				answer = in.next().toUpperCase();
			}
		}
		in.close(); // close the scanner
	}

	/**
	 * Computes the product of the length and width of the rectangle
	 * 
	 * @param length
	 *            length of the rectangle
	 * @param width
	 *            width of the rectangle
	 * @return length * width
	 */
	public static double areaOfRectangle(double length, double width) {
		double product = length * width;
		// the product of length * width is returned to the main method
		return product;
	}
}
