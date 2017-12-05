import java.util.Scanner;

/**
 * 
 * @author jtwinters
 *
 */
public class Fib {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Number: ");
		int n = in.nextInt();
		in.close();
		
		System.out.println(fib(n));
	}
	
	//0 1 1 2 3 5
	public static int fib(int n) {
		
		//special/base cases
		if (n == 0) 
			return 0;
		
		if (n == 1)
			return 1;
		
		if (n == 2)
			return 1;
		
		//recursion
		return fib(n-1) + fib(n-2);
	}
}
