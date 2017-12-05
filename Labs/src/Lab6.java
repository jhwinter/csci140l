import java.util.Scanner;

/**
 * This program translates a letter grade into a number grade.  
 * Letter grades are A, B, C, D, and F, possibly followed by + or -.  
 * Their numeric values are 4, 3, 2, 1, and 0 respectively.  
 * There is no A+, F+, or F-.  A "+" increases the numeric value by 0.3, 
 * a "-" decreases it by 0.3.
 * @author Jonathan Winters
 * September 10, 2015
 */

public class Lab6 
{

	public static void main(String[] args) 
	{
		//create a scanner
		Scanner in = new Scanner(System.in);
		
		//ask the user for input
		System.out.print("Enter a letter grade: ");
		
		//declare and initialize variables
		String letterGrade = in.nextLine();
		letterGrade = letterGrade.toUpperCase();
		float numberGrade = 0;
		
		//use if statements to to translate letter grades to numeric values
		if (letterGrade.equals("A")){
			numberGrade = 4.0f;
		}else if (letterGrade.equals("A-")){
			numberGrade = 3.7f;
		}else if (letterGrade.equals("B+")){
			numberGrade = 3.3f;
		}else if (letterGrade.equals("B")){
			numberGrade = 3.0f;
		}else if (letterGrade.equals("B-")){
			numberGrade = 2.7f;
		}else if (letterGrade.equals("C+")){
			numberGrade = 2.3f;
		}else if (letterGrade.equals("C")){
			numberGrade = 2.0f;
		}else if (letterGrade.equals("C-")){
			numberGrade = 1.7f;
		}else if (letterGrade.equals("D+")){
			numberGrade = 1.3f;
		}else if (letterGrade.equals("D")){
			numberGrade = 1.0f;
		}else if (letterGrade.equals("D-")){
			numberGrade = 0.7f;
		}else if (letterGrade.equals("F")){
			numberGrade = 0.0f;
		}
		
		//print out numeric value
		System.out.println("The numeric value is " + numberGrade + ".");
		
		in.close();
		
	}
}
