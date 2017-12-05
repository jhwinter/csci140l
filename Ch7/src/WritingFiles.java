import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingFiles {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		
		PrintWriter out = new PrintWriter("output.txt");
		
		for (int i=1; i<=10; i++){
			out.println(i);
		}
		System.out.println("output.txt");
		out.close();
	}

}
