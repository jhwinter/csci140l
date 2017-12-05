import java.util.Scanner; // imported the scanner

/**
 * Write a method called makeRow that is passed two arguments: an int n and a
 * String s, and which returns a String containing n copies of s, concatenated
 * in a row. For instance, if we call the method with makeRow(5, "*"), the
 * method returns *****.
 * 
 * Write a method called printUpTriangle that is passed two arguments, an int n
 * and a String s and uses your makeRow() method. It should print a right
 * triangle in which the base of the triangle is made of n copies of s, and the
 * vertex of the triangle has a single copy of s on the right. For example,
 * calling printUpTriangle(3, "*"); prints the following lines:
 *
 **
 ***
 * 
 * 
 * Design your program to ask the user for a number to represent the number of
 * *'s at the base of the triangle. Then print out the triangle by passing that
 * number to your printUpTriangle() method. October 29, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab16 { // created the class Lab16

	/**
	 * an entry point into the program
	 * 
	 * @param args
	 *            Command line arguments
	 */
	public static void main(String[] args) {
		// created the scanner
		Scanner in = new Scanner(System.in);
		// ask the user for input
		System.out.print("Please enter a number: ");
		int n = in.nextInt(); // set n as the user input
		in.close(); // close the scanner
		String s = "*";
		/*
		 * triangle is the printUpTriangle method which passes in s as the star
		 * and n is the number of times s gets copied
		 */
		String triangle = printUpTriangle(n, s);
		System.out.print(triangle);
		// print out whatever was returned from printUpTriangle

	}

	/**
	 * This method prints whatever s is in a row
	 * 
	 * @param n
	 *            number of times s gets copied
	 * @param s
	 *            the thing that gets printed
	 * @return a row of whatever is getting printed
	 */
	public static String makeRow(int n, String s) {
		String stars = ""; // set stars to be an empty string
		// set i = 1, as long as i <= n, i will continue to increment
		for (int i = 1; i <= n; i++) {
			stars = stars + s; // stars = stars + whatever is getting printed
		}
		return stars; // return stars to the method

	}

	/**
	 * This method prints whatever s is in a row and then goes to another row to
	 * whatever s is again until it reaches n
	 * 
	 * @param n
	 *            number of times s gets copied
	 * @param s
	 *            the thing that gets printed
	 * @return lines of rows of whatever is getting printed
	 */
	public static String printUpTriangle(int n, String s) {
		String stars = ""; // set stars to be an empty string
		// set i = 1, as long as i <= n, i will continue to increment
		for (int i = 1; i <= n; i++) {
			stars = stars + makeRow(i, s) + "\n";
			/*
			 * stars = stars + whatever makeRow returns and then moves to the
			 * new line
			 */
		}
		return stars; // return stars to the method
	}
}