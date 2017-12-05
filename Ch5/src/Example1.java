/**
 * An example using and writing methods in Java
 * 
 * @author jtwinters
 *
 */
public class Example1 {

	/**
	 * The entry point for our program
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		double sumOfNumbers = sum(1.5, 2.5, 3.5);
		System.out.println("Sum of 1.5, 2.5, 3.5 = " + sumOfNumbers);
		System.out.println(sum(1, 2, 3));

		System.out.println("abs(-10.4): " + abs(-10.4));
		double x = abs(20.5);
		System.out.println("abs(20.5): " + x);

		System.out.println("2^3: " + pow(2, 3));
		System.out.println("5^2: " + pow(5, 2));
		System.out.println("2^0: " + pow(2, 0));
	}

	/**
	 * Computes the sum of 3 numbers.
	 * @param a number1
	 * @param b number2
	 * @param c number3
	 * @return The sum a, b, and c
	 */
	public static double sum(double a, double b, double c) {
		double d = a + b + c;
		return d;
	}

	/**
	 * This computes the absolute value of x
	 * @param x Number to take the abs value of
	 * @return The absolute value of x
	 */
	public static double abs(double x) {
		if (x < 0) {
			return x * -1;
		}
		return x;
	}

	/**
	 * Computes num to the exp power
	 * @param num base number
	 * @param exp exponent
	 * @return num^exp
	 */
	public static double pow(double num, double exp) {

		double result = 1;
		for (int i = 1; i <= exp; i++) {
			result = result * num;
		}
		return result;
	}
}
