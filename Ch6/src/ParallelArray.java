import java.util.Scanner;

public class ParallelArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] cars = new String[3];
		String[] colors = new String[3];
		int[] years = new int[3];
		
		for (int i = 0; i<cars.length; i++) {
			System.out.print("Car model: ");
			cars[i] = in.nextLine();
			System.out.print("Color: ");
			colors[i] = in.nextLine();
			System.out.print("Year: ");
			years[i] = in.nextInt();
			in.nextLine();
		}
		
		System.out.print("Enter an index between 0 and 2: ");
		int index = in.nextInt();
		
		System.out.println(cars[index] + ", " + colors[index] + ", " + years[index]);
		
		in.close();
	}
}
