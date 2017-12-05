import java.util.Scanner;

/**
 * A  program that displays duplicate if a duplicate entry has been entered twice in a row
 * @author jonathan
 *
 */
public class DuplicateInput {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number (q to quit): ");
		int input = in.nextInt();
		
		System.out.print("Number (q to quit): ");
		input = in.nextInt();
		
		while (in.hasNextInt()){
			int prev = input;
			input = in.nextInt();
			
			if (prev == input){
				System.out.println("Duplicate!");
			}
			System.out.print("Number (q to quit): ");
		}
		in.close();
		
	}
}
