/** Creates variables for each of the primitive
 number types in Java, initializes them, and
 prints out their values. Then modifies those number types and prints them out.
 Then creates constants and prints them out.
 
 @author Jonathan Winters
 
 */
public class Lab2 {
	
	public static void main(String[] args){
		
	//declaration and initialization of variables
	int v1 = 1;
	byte v2 = 2;
	short v3 = 3;
	long v4 = 4;
	double v5 = 5.5;
	float v6 = 6.6f;
	char v7 = '7';
	
	//print out values
	System.out.println("v1 = " + v1);
	System.out.println("v2 = " + v2);
	System.out.println("v3 = " + v3);
	System.out.println("v4 = " + v4);
	System.out.println("v5 = " + v5);
	System.out.println("v6 = " + v6);
	System.out.println("v7 = " + v7);
	
	//reassign values
	v1 = 11;
	v2 = 22;
	v3 = 33;
	v4 = 44;
	v5 = 5.55;
	v6 = 6.67f;
	v7 = 'g';
	
	//print new values
	System.out.println("v1 = " + v1);
	System.out.println("v2 = " + v2);
	System.out.println("v3 = " + v3);
	System.out.println("v4 = " + v4);
	System.out.println("v5 = " + v5);
	System.out.println("v6 = " + v6);
	System.out.println("v7 = " + v7);
	
	//constants
	final int VAR1 = 1;
	final byte VAR2 = 2;
	final short VAR3 = 3;
	final long VAR4 = 4;
	final double VAR5 = 5.5;
	final float VAR6 = 6.6f;
	final char VAR7 = '7';
	
	//print out constants
	System.out.println("VAR1 = " + VAR1);
	System.out.println("VAR2 = " + VAR2);
	System.out.println("VAR3 = " + VAR3);
	System.out.println("VAR4 = " + VAR4);
	System.out.println("VAR5 = " + VAR5);
	System.out.println("VAR6 = " + VAR6);
	System.out.println("VAR7 = " + VAR7);
	}
}
