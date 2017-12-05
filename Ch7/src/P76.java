import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

Write a program Find that searches all files specified on the command line and prints
out all lines containing a specified word. For example, if you call
java Find ring report.txt address.txt Homework.java
then the program might print
report.txt: has broken up an international ring of DVD bootleggers that
address.txt: Kris Kringle, North Pole
address.txt: Homer Simpson, Springfield
Homework.java: String filename;
The specified word is always the first command line argument.

*/
public class P76 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		

		if (args.length < 2){
			System.out.println("Usage: java P76 searchTerm file1 file2 ... fileN");
			System.exit(1);
		}
		
		String search = args[0];
		
		for (int i=1; i<args.length; i++){
			
			File file = new File(args[i]);
			Scanner in = new Scanner(file);
			
			while (in.hasNextLine()){
				String line = in.nextLine();
				if (line.indexOf(search) != -1){
					//found term
					System.out.println(args[i] + ": " + line);
				}
			}
			in.close();
		}

	}

}
