import java.util.Scanner;
/**
 * Count the number of char occurences in a string
 * @author jonathan
 *
 */
public class CountingMatches {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String line = in.nextLine();
		
		System.out.print("Please enter a char to count: ");
		char search  = in.nextLine().charAt(0);
		
		int count = 0;
		
		for (int i = 0; i < line.length(); i++){
			
			if (search == line.charAt(i)){
				count++;
			}
		}
		
		System.out.println("The char " + search + " occured " + count + "times!" );
		
		
		in.close();
	}
}
