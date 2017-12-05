import java.util.Scanner;
/**
 * 
 * @author Jonathan Winters
 *
 */
public class Ch3P330 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Checking balance: ");
		double checking = in.nextDouble();
		in.nextLine(); // consume new line char
		
		if (checking < 0){
			System.out.println("Error: Negative balance!");
			System.exit(1);
		}
		
		System.out.print("Savings balance: ");
		double savings = in.nextDouble();
		in.nextLine(); 
		
		if (savings < 0){
			System.out.println("Error: Negative balance!");
			System.exit(1);
		}
		
		System.out.print("Transaction (D)eposit, (W)ithdrawal, (T)ransfer: ");
		String transaction = in.nextLine();
		transaction = transaction.toUpperCase();
		
		String acctType = null;
		double amount = 0.0;
		
		switch (transaction){
		case "D":
			System.out.print("Account (Savings/Checking): ");
			acctType = in.nextLine().toLowerCase();
			if (acctType.equals("savings")){
				System.out.print("Amount: ");
				amount = in.nextDouble();
				in.nextLine();
				if (amount > 0){
					savings += amount;
				}else{
					System.out.println("Error: You can't deposit a negative number!");
				}
			}else if (acctType.equals("checking")){
				System.out.print("Amount: ");
				amount = in.nextDouble();
				in.nextLine();
				if (amount > 0){
					checking += amount;
				}else{
					System.out.println("Error: You can't deposit a negative number!");
				}
			}else{
				System.out.println("Error: Invalid account type!");
			}
			break;
			
		case "W":
			System.out.print("Account (Savings/Checking): ");
			acctType = in.nextLine().toLowerCase();
			if (acctType.equals("savings")){
				System.out.print("Amount: ");
				amount = in.nextDouble();
				in.nextLine();
				if (amount > 0 && savings - amount >= 0){
					 savings -= amount; // same as savings = savings - amount;
				}else{
					System.out.println("Error: You can't withdrawal a negative number!");
				}
			}else if (acctType.equals("checking")){
				System.out.print("Amount: ");
				amount = in.nextDouble();
				in.nextLine();
				if (amount > 0 && checking - amount >= 0){
					 checking -= amount; // same as checking = checking - amount;
				}else{
					System.out.println("Error: You can't withdrawal a negative number!");
				}
			}else{
				System.out.println("Error: Invalid account type!");
			}
			break;
			
		case "T":
			System.out.print("Transfer from (Savings/Checking): ");
			acctType = in.nextLine().toLowerCase();
			if (acctType.equals("savings")){
				System.out.print("Amount: ");
				amount = in.nextDouble();
				in.nextLine();
				
				if (amount < 0){
					System.out.println("Error: You can't transfer a negative number!");
				}else if (savings - amount < 0){
					System.out.println("Error: You don't have enough funds!");
				}else{
					// transfer!
					savings -= amount;
					checking += amount;
				}
				
			}else if (acctType.equals("checking")){
				System.out.print("Amount: ");
				amount = in.nextDouble();
				in.nextLine();
				
				if (amount < 0){
					System.out.println("Error: You can't transfer a negative number!");
				}else if (checking - amount < 0){
					System.out.println("Error: You don't have enough funds!");
				}else{
					// transfer!
					checking -= amount;
					savings += amount;
				}
			}else{
				System.out.println("Error: Invalid account type!");
			}
			break;
			
			default:
				System.out.println("Error: Invalid transaction type!");
				System.exit(2);
		}
		
		System.out.printf("Savings balance: $%.2f\n", savings);
		System.out.printf("Checking balance: $%.2f\n", checking);
		
		in.close();
		
	}

}
