import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;

		int grade;

		System.out.print("Please enter a grade (q to quit): ");

		while (in.hasNextInt()) {
			grade = in.nextInt();
			sum = sum + grade;
			count++;

			System.out.print("Please enter a grade (q to quit): ");
			
		}

		double avg = (double)sum / count;
		System.out.printf("Avg: %.2f\n", avg);
		
		in.close();
	}

}
