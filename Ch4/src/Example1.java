import java.util.Scanner;
/**
 * An example using while and for loops in Java.
 * @author Jonathan Winters
 * 
 *
 */
public class Example1 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int iter = in.nextInt();
		
		int i = 1;
		while (i <= iter)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		i = 0;
		while (i <= iter)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		for (i = 0; i < iter; i++)
		{
			System.out.println(i);
		}
		
		int count = 0;
		int sum = 0;
		
		int grade;
		
		System.out.print("Please enter a grade (-1 to quit): ");
		grade = in.nextInt();
		
		while (grade != -1)
		{
			sum = sum + grade;
			count++;
			
			System.out.print("Please enter a grade (-1 to quit): ");
			grade = in.nextInt();
		}
		
		double avg = (double)sum / count;
		System.out.printf("Avg: %.2f\n", avg);
		
		in.close();
	}
}
