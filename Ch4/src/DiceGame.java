import java.util.Scanner;
/** 
 * A 2 player dice game
 * @author jtwinters
 *
 */
public class DiceGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter player 1's name: ");
		String player1 = in.nextLine();
		System.out.print("Please enter player 2's name: ");
		String player2 = in.nextLine();
		
		String contin = "y";
		while (contin.equals("y")) {
		
		int p1roll1 = (int)(Math.random() * 6) + 1;
		int p1roll2 = (int)(Math.random() * 6) + 1;
		int p2roll1 = (int)(Math.random() * 6) + 1;
		int p2roll2 = (int)(Math.random() * 6) + 1;
		
		
		int p1Total = p1roll1 + p1roll2;
		int p2Total = p2roll1 + p2roll2;
		// Alice rolled a 3 and a 4 for a total of 7.
		
		System.out.printf("%s rolled a %d and a %d for a total of %d.\n", player1, p1roll1, p1roll2, p1Total);
		System.out.printf("%s rolled a %d and a %d for a total of %d.\n", player2, p2roll1, p2roll2, p2Total);
		
		if (p1Total > p2Total) {
			System.out.printf("%s won!\n", player1);
		}else if (p1Total == p2Total) {
			System.out.printf("%s and %s tied!\n", player1, player2);
		} else {
			System.out.printf("%s won!\n", player2);
		}
		System.out.println();
		do {
		System.out.print("Would you like to play again (y/n): ");
		contin = in.nextLine().toLowerCase();
		} while (!contin.equals("y") && (!contin.equals("n")));
		}
		System.out.println();
		
		in.close();
	}
}
