import java.util.Scanner;

/**
 * 
 * @author Jonathan Winters
 *
 */
public class Example3 {
	
	public static void main(String[] args){
		
		final int RATE1_SINGLE = 32000;
		final int RATE1_MARRIED = 64000;
		final double RATE1 = 0.10;
		final double RATE2 = 0.25;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your income: ");
		double income = in.nextDouble();
		in.nextLine();
		
		System.out.print("Please enter your marital status (m or s): ");
		String maritalStatus = in.nextLine();
		maritalStatus = maritalStatus.toLowerCase();
		
		in.close();
		
		double tax = 0.0;
		
		if (maritalStatus.equals("m") && income > RATE1_MARRIED){
			tax = (RATE1_MARRIED * RATE1) + (income - RATE1_MARRIED) * RATE2;
		}else if (maritalStatus.equals("s") && income > RATE1_SINGLE){
			tax = (RATE1_SINGLE *RATE1) + (income - RATE1_SINGLE) * RATE2;
		}else if (
				maritalStatus.equals("m") && income <= RATE1_MARRIED 
				|| 
				maritalStatus.equals("s") && income <= RATE1_SINGLE
				){
		tax = income * RATE1;
		}
		
		System.out.printf("Your tax is: $%.2f\n", tax);
		
	}
	
	
}
