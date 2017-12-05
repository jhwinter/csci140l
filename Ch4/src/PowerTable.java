/**
 * Prints the power of x in a table.
 * @author jtwinters
 *
 */
public class PowerTable {

	public static void main(String[] args) {
		
		final int COLS = 4;
		final int ROWS = 10;
		
		System.out.printf("%10s%10s%10s%10s\n", "x^1", "x^2", "x^3", "x^4");
		
		for (int i = 1; i <= ROWS; i ++) {
			
			for (int j = 1; j <= COLS; j++) {
				
				System.out.printf("%10.0f", Math.pow(i, j));
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}
}
