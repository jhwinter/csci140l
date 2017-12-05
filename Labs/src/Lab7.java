import java.util.Scanner;

/**
 * Modify the original code so that it prompts the user to enter a third value
 * for a variable z. Rewrite the logic so that the program prints out the
 * smallest value contained in x, y, and z. 
 * @ Jonathan Winters 
 * September 15, 2015
 */
public class Lab7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // created a scanner
		System.out.println("Enter a value for x:");
		int x = scan.nextInt(); // declared and initialized x
		System.out.println("Enter a value for y:");
		int y = scan.nextInt(); // declared and initialized y
		System.out.println("Enter a value for z: ");
		int z = scan.nextInt(); // declared and initialized z

		if (x <= y) { // if x is less than y and z, then print x
			if (x <= z) {
				System.out.println("The smallest value was " + x);
				System.exit(0);
			}
		}
		if (y <= x) { // if y is less than x and z, then print y
			if (y <= z) {
				System.out.println("The smallest value was " + y);
				System.exit(0);
			}
		}
		if (z <= x) { // if z is less than x and y, then print z
			if (z <= y) {
				System.out.println("The smallest value was " + z);
				System.exit(0);
			}
		}
		scan.close(); //close the scanner
	}

}
