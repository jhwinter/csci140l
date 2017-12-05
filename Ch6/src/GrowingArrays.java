import java.util.Arrays;
import java.util.Scanner;

public class GrowingArrays {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double[] values = new double[2];
		int currentSize = 0;
		
		System.out.print("Number: ");
		
		while(in.hasNextDouble()) {
			
			if (currentSize >= values.length) {
				//grow the array
				System.out.println("Growing + " + values.length + " --> " + (values.length * 2));
				values = Arrays.copyOf(values, values.length * 2);
				
			}
			
			values[currentSize] = in.nextDouble();
			currentSize++;
			System.out.print("Number: ");
		}
		
		System.out.println(Arrays.toString(values));
		
		//trim the array
		values = Arrays.copyOf(values, currentSize);
		
		in.close();
	}
}
