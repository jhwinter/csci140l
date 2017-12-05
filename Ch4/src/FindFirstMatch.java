import java.util.Scanner;
/**
 * Find the first occurance of a character in a string
 * @author jonathan
 *
 */
public class FindFirstMatch {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String line = in.nextLine();
		
		System.out.print("Please enter a char to find: ");
		char search = in.nextLine().charAt(0);
		
		boolean found = false;
		
		int i = 0;
		int foundPos = 0;
		while (i < line.length()){
			
			char currentChar = line.charAt(i);
			if (currentChar == search){
				found = true;
				foundPos = i;
			}
			
			i++;
		}
		
		i--;
		
		System.out.println("Found: " + found);
		System.out.println("i: " + i);
		System.out.println("FoundPos: " + foundPos);
		
		System.out.println("indexOf: " + line.indexOf(search));
		
		
		in.close();
	}
}
