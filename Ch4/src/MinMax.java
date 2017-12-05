import java.util.Scanner;
/**
 * 
 * @author jonathan
 *
 */
public class MinMax {

	public static void main(String[] args){
		
		int max, min, input;
		
		Scanner in = new Scanner(System.in);
		
		input = in.nextInt();
		max = input;
		min = input;
		
		while (in.hasNextInt()){
			input = in.nextInt();
			
			if (input > max){
				max = input;
			}
			
			if (input < min){
				min = input;
			}
		}
		System.out.print("Max: " + max);
		System.out.print("Min: " + min);
		
		in.close();
	}
}
