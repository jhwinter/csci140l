import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Example1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inFile = new File("output.txt");
		Scanner in = new Scanner(inFile);
		PrintWriter out = new PrintWriter("output2.txt");
		
		
		while (in.hasNextLine()){
			String line = in.nextLine();
			int i = Integer.parseInt(line);
			i = i * 2;
			out.println(i);	
		}
		
		in.close();
		out.close();
		
		

	}

}
