import java.util.Scanner;

/**
 * Write a program that translates a letter grade into a number grade.  
 * Letter grades are A, B, C, D, and F, possibly followed by + or -.  
 * Their numeric values are 4, 3, 2, 1, and 0 respectively.  
 * There is no A+, F+, or F-.  A "+" increases the numeric value by 0.3,
 *  a "-" decreases it by 0.3.  
 * @author Jonathan Winters
 *
 */
public class Lab6 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		String letterGrade = in.nextLine();
		char letter = letterGrade.charAt(0);
		char plusOrMinus;
		if (letterGrade.length() > 1)
		{
			plusOrMinus = letterGrade.charAt(1);
		}else{
			plusOrMinus = ' ';
		}
		
		double gpa = 0.0;
		
		switch(letter){
		case 'A': //we can't have an A+
			gpa = 4.00;
			if (plusOrMinus == '-'){
				gpa -= 0.3; //same thing as gpa = gpa -.3;
			}
			break;
			
		case 'B':
			gpa = 3.00;
			if (plusOrMinus == '+'){
				gpa += 0.3; //same as gpa = gpa + 0.3;
			}else if (plusOrMinus == '-'){
				gpa -= 0.3;
			}
			break;
			
		case 'C':
			gpa = 2.00;
			if (plusOrMinus == '+'){
				gpa += 0.3; //same as gpa = gpa + 0.3;
			}else if (plusOrMinus == '-'){
				gpa -= 0.3;
			}
			break;
			
		case 'D':
			gpa = 1.00;
			if (plusOrMinus == '+'){
				gpa += 0.3; //same as gpa = gpa + 0.3;
			}else if (plusOrMinus == '-'){
				gpa -= 0.3;
			}
			break;

		case 'F':
			gpa = 0.00;
			break;
			
			default:
				System.out.println("Invalid letter grade!");
		}
		System.out.printf("The numeric value is %3.1f.\n", gpa);
		
		in.close();
	
	}
	
}
