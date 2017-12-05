import java.util.Scanner;

/**
 * Count the number of pos, neg, and zero inputs
 * @author canance
 *
 */
public class PracticeLab {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		int neg = 0;
		int pos = 0;
		int zero = 0;
		
		
		System.out.print("Number (q to quit): ");
		
		while (in.hasNextInt()){
			int input = in.nextInt();
			
			if (input < 0){
				neg++;
			}
			
			if (input > 0){
				pos++;
			}
			
			if (input == 0){
				zero++;
			}
			count++;
			
			System.out.print("Number (q to quit): ");
		}
		
		System.out.printf("Count: %d\n", count);
		System.out.printf("%-10s%-10s%-10s\n", "Positive", "Zero", "Negative");
		System.out.printf("%-10d%-10d%-10d\n", pos, zero, neg);
		
		in.close();
	}
	
}
