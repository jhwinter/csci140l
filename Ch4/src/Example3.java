import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		boolean done = false;

		int grade;

		System.out.print("Please enter a grade (-1 to quit): ");
		grade = in.nextInt();

		while (!done) {
			if (grade == -1) {
				done = true;
			} else {
				sum = sum + grade;
				count++;

				System.out.print("Please enter a grade (-1 to quit): ");
				grade = in.nextInt();
			}
		}

		double avg = (double) sum / count;
		System.out.printf("Avg: %.2f\n", avg);
		
		in.close();
	}
}
