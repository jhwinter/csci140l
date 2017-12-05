import java.util.Scanner;
/**
 * 
 * @author jonathan
 *
 */
public class InputValidation {

	public static void  main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		boolean valid = false;
		int input = 0;
		
		while (!valid){
			System.out.print("Please enter a positive value < 100: " );
			input = in.nextInt();
			
			if (input >= 0 && input < 100){
				valid = true;
			}else{
				System.out.println("Invalid input, try again!");
			}
			in.close();
		}
		
		System.out.println("You entered: " + input);
	}
}
