/**
 * Examples using arithmetic in java
 * 
 * @author Jonathan Winters
 * 
 */
public class Arithmetic {

	public static void main(String[] args) {

		// booleans
		boolean skyIsGreen = false;
		System.out.println("The sky is green: " + skyIsGreen);
		skyIsGreen = !skyIsGreen;
		System.out.println("The sky is green: " + skyIsGreen);

		// arithmetic
		int x = 2;
		int y = 3;

		int z = x / y;
		System.out.println(x + " / " + y + " = " + z);
		
		int m = x % y;
		System.out.println(x + "%" + y + "=" + m);
		
		double zz = x / y;
		System.out.println(x + " / " + y + " = " + zz);
		
		/* 
		 * Casting:
		 * (datatype) x; where x is the variable
		 * If losing precision then we must cast!
		 */
		
		zz = ((double)x) / y;
		System.out.println(x + " / " + y + " = " + zz);
		
		zz = (1.0 * x) / y;
		System.out.println(x + " / " + y + " = " + zz);
		
		/*
		 * Incrementation and Decrementation
		 */
		
		System.out.println("X before inc: " + x);
		x++; //same as x = x + 1
		System.out.println("X after inc: " + x);
		
		System.out.println("X before dec: " + x);
		x--; //same as x = x - 1
		System.out.println("X after dec:" + x);
		
		//postfix operator
		System.out.println("x++ = " + x++);
		System.out.println("x = " + x);
		
		//prefix operator
		System.out.println("++x = " + ++x);
		System.out.println("x = " + x);
		System.out.println("--x = " + --x);
		System.out.println("x = " + x);
		
		/*
		 * Math library
		 */
		
		zz = Math.pow(y, 2);
		System.out.println(y + "^" + 2 + " = " + zz);
		x = (int) Math.pow(y, 2);
		System.out.println(y + "^" + 2 + " = " + zz);
		
		x = -x;
		System.out.println("abs(" + x + ") = " + Math.abs(x));
		
		zz = Math.sqrt(9.0);
		System.out.println("sqrt(9.0) = " + zz);
		
		System.out.println("PI = " + Math.PI);
		
		
	}
}
