/**
 * This program computes and displays the perimeter of a letter-size 
 * (8.5 x 11 inches) sheet of paper and the length of its diagonal
 * @author Jonathan Winters
 * date: 8-27-15
 */
public class Lab3 {
	public static void main(String[] args) {
		
		//declare and initialize the constants
		final float LENGTH = 8.5f;
		final byte WIDTH = 11;
		
		//declare and initialize the perimeter
		float perimeter = (LENGTH * 2) + (WIDTH * 2);
		System.out.println("Perimeter: " + perimeter);
		
		//use the Pythagorean Theorem to find the diagonal length
		double diagonalsq = Math.pow(LENGTH, 2) + Math.pow(WIDTH, 2);
		double diagonal = Math.sqrt(diagonalsq);
		System.out.println("Diagonal Length: " + diagonal);
	}
	
}