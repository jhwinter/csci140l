import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TryCatch {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		
		if (args.length != 1){
			System.out.println("Usage: java TryCatch fileName");
			System.exit(1);
		}
		
		String fName = args[0];
		
		try{
		System.out.println("Sum: " + sumFile(fName));
		}catch(FileNotFoundException e){
			System.out.println("Error: " + e.getMessage());
		}

	}
	
	public static int sumFile(String fName) throws FileNotFoundException{
		
		Scanner in = new Scanner(new File(fName));
		
		int sum = 0;
		
		while (in.hasNextInt()){
			sum += in.nextInt();
		}
		
		in.close();
		
		return sum;
		
	}

}
