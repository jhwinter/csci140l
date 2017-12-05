import java.util.Scanner;

public class Example2 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		
		int grade;
		
		System.out.print("Please enter a grade (-1 to quit): ");
		grade = in.nextInt();
		
		do
		{
			if (grade != -1) {
			sum = sum + grade;
			count++;
			
			System.out.print("Please enter a grade (-1 to quit): ");
			grade = in.nextInt();
		}
		} while (grade != -1);
		double avg = (double)sum / count;
		System.out.printf("Avg: %.2f\n", avg);
		
		in.close();
	}
}
