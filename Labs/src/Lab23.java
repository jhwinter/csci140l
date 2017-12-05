import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads each line in a file, reverses it's lines, and
 * writes them to another file. For example, if the file input.txt contains the
 * lines:
 * 
 * Mary had a little lamb Its fleece was white as snow And everywhere that Mary
 * went The lamb was sure to go.
 * 
 * and you run
 * 
 * java reverse input.txt output.txt
 * 
 * then output.txt contains:
 * 
 * The lamb was sure to go. And everywhere that Mary went Its fleece was white
 * as snow Mary had a little lamb
 * 
 * Design your program to get both file names from the command line arguments.
 * Add a check to make sure that the command line arguments contains two file
 * paths. Use a try/catch block to open the files, if an exception occurs then
 * print a friendly message to the user.
 * 
 * November 29, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab23 {

	/**
	 * Entry point for program
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * use a try/catch block to open files and display a friendly error
		 * message if an exception occurs
		 */
		try {
			/*
			 * if there is not a second argument given, then print an error
			 * message and exit the program.
			 */
			if (args.length != 2) {
				System.out.println("Error: Program will only run when given two file paths.");
				System.exit(1);
			}
			// file1 is the whatever the first argument is
			File file1 = new File(args[0]);
			// the scanner is used to read the contents of file1
			Scanner in = new Scanner(file1);
			// printwriter will be used to write to whatever text file name the
			// second argument is
			PrintWriter out = new PrintWriter(args[1]);

			/*
			 * while file1 still has more lines, the loop will continue to run
			 */
			while (in.hasNextLine()) {
				// all of the content from file1 will be stored in an Array List
				ArrayList<String> fileContent = new ArrayList<String>();
				while (in.hasNextLine()) {
					fileContent.add(in.nextLine());
				}
				/*
				 * starting i at the last line, the program will print out the
				 * line to the second file until i = 0
				 */
				for (int i = fileContent.size(); i > 0; i--) {
					String line = fileContent.get(i - 1);
					out.println(line);
				}
			}
			in.close(); // close the scanner
			out.close(); // close printwriter
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			// print friendly error message if "File Not Found Exception" occurs
		}
	}
}