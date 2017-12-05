/**
 * Demonstrate variable declaration, initialization, and assignment
 * @author Jonathan Winters
 *
 */
public class Example {
	
	public static void main(String[] args){
		
		int x; //declaration
		x = 7; //initialization (assignment)
		
		System.out.println(4 + x);
		System.out.println("x = " + x + "!");
		
		int y = x + 3;
		System.out.println("y = " + y);
		
		/*
		 * This is an example of
		 * an assignment using the variable
		 * within the assignment
		 */
		y = y * 2;
		System.out.println("y = " + y);
		
		char letter = 'a';
		char letter2 = '&';
		System.out.print(letter);
		System.out.println(letter2);
		
		//constants
		final int CANS = 4;
		final int OZ_PER_CAN = 12;
		int totalOz = CANS * OZ_PER_CAN;
		
		System.out.println("Total Ounces:" + totalOz);
		
	}
}