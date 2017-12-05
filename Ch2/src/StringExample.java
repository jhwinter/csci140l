import java.util.Scanner;

/**
 * An example of using Scanner and String methods in Java.
 * @author Jonathan Winters
 *
 */

public class StringExample {
	
	public static void main(String[] args){
		//create a scanner
		Scanner in = new Scanner(System.in); //read from keyboard
		
		System.out.print("Please enter your first and last name: ");
		String first = in.next();
		String last = in.next();
		
		String fullName = first + " " + last;
		
		System.out.print("Please enter your age: ");
		int age = in.nextInt();
		in.nextLine(); //consume new line char!
		
		System.out.println("Hello, " + fullName + "!");
		System.out.println("I see that you are " + age + " years old.");
		
		//using printf statements
		System.out.printf("Hello, %s!\n", fullName);
		System.out.printf("I see that you are %d years old.\n", age);
		
		System.out.print("Please enter a string to echo: ");
		String line = in.nextLine();
		System.out.println(line);
		
		double pricePerLiter = 1.21997;
		System.out.printf("The price per liter: %4.2f\n", pricePerLiter);
		System.out.printf("The price per liter: %10.3f\n", pricePerLiter);
		
		System.out.printf("%-10s%-10s\n", "Item", "Price");
		System.out.printf("%-10s%-10d\n", "TV", 3500);
		System.out.printf("%-10s%-10.2f\n", "Gas", pricePerLiter);
		
		//escape sequences
		//newline char
		System.out.print("*\n**\n***\n");
		
		//backslash
		System.out.println("c:\\program files\\java");
		
		//double quotes
		System.out.println("\"Double quotes\"");
		
		//tab
		System.out.println("\tA tabbed sequence.");
		
		//String methods
		//charAt
		String hello = "hello";
		char firstChar = hello.charAt(0);
		System.out.println("Firstchar: " + firstChar);
		
		char lastChar = hello.charAt(hello.length() - 1);
		System.out.println("lastchar: " + lastChar);
		
		//substring
		String sub = hello.substring(0, 2);
		System.out.println(sub);
		
		in.close();
		
	}
}
