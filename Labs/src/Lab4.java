/**
 * Using the substring method and concatenation, write a sequence of commands
 *  that will extract characters from inputString = 
 *  "The quick brown fox jumps over the lazy dog"
 *  to make outputString = "Tempus fugit".
 *  Then print outputString.
 * @author Jonathan Winters
 * 
 */

public class Lab4 {

	public static void main(String[] args) {
		
		//declared and initialized variables
		//concatenated all of the strings 
		String inputString = "The quick brown fox jumps over the lazy dog";
		String outputString = inputString.substring(0, 1) + 
		inputString.substring(2, 3) + inputString.substring(22, 24) + 
		inputString.substring(5, 6) + 
		inputString.substring(24, 26) + inputString.substring(16, 17) +
		inputString.substring(5, 6) + inputString.substring(42) + 
		inputString.substring(6, 7) + inputString.substring(31, 32);
		
		//printed the outputString
		System.out.println(outputString);
		
	}
	
}
