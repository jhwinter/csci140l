import java.util.Scanner;

/**
 * Examples using if statements in Java
 * 
 * @author jonathan
 *
 */

public class Example1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");

		int x = in.nextInt();
		in.nextLine(); // consume the newline character

		// determine if x is even or odd
		if (x % 2 == 0) {
			System.out.println(x + " is even!");
		} else {
			System.out.println(x + " is odd!");
		}

		// we don't always need the else

		if (x < 10) {
			System.out.printf("%d is greater than 10.\n", x);
		}

		/*
		 * conditional operator - create a string and assign it the word even or
		 * odd depending on the value of x
		 * 
		 */
		String evenOdd = (x % 2 == 0) ? "Even" : "Odd";
		System.out.println("EvenOdd: " + evenOdd);
		// this is the same as:
		String evenOdd2;
		if (x % 2 == 0) {
			evenOdd2 = "Even";
		} else {
			evenOdd2 = "Odd";
		}
		System.out.printf("Evenodd2: %s\n", evenOdd2);

		/*
		 * relational operators >, >=, <, <=, ==, !=
		 */

		System.out.print("Please enter another number: ");
		int y = in.nextInt();
		in.nextLine(); // consume the newline char

		if (x < y) {
			System.out.printf("%d is greater than %d.\n", x, y);
		}

		if (x < y) {
			System.out.printf("%d is less than %d.\n", x, y);
		}

		if (x == y) {
			System.out.printf("x and y are equal!/n");
		}

		if (x != y) {
			System.out.printf("%d does not equal %d!\n", x, y);
		}
		
		/*
		 * String comparisons
		 * We can't use == instead we use String.equal()
		 */
		
		System.out.print("Please enter a String: ");
		String a = in.nextLine();
		
		System.out.print("Please enter a String: ");
		String b = in.nextLine();
		
		if (a.equals(b)){
			System.out.println("Your strings are equal!");
		}else{
			System.out.println("Your strings are not equal!");
		}
		
		/*
		 * To determine the ordering of string use the String.compareTo()
		 */
		
		if (a.compareTo(b) == 0){
			System.out.println("A and B are equal.");
		}else if (a.compareTo(b) < 0){
			System.out.println("A comes before B.");
		}else{ //a.compareTo(b) > 0
			System.out.println("B comes before A.");
		}
		
		in.close();

	}

}
