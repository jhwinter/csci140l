/**
 * Use nested for loops to produce the following output 
 * 1 1 
 * 1 2 
 * 1 3 
 * 1 4 
 * 2 1 
 * 2 2
 * 2 3 
 * 2 4
 * 
 * Let the outer loop print the numbers in the left column, and the inner loop
 * print the numbers in the right column.In each iteration, print the loop
 * control variables to produce the output.
 * 
 * Once you have that working, do the same thing with a while loop, and then
 * again with a do-while loop.
 * October 20, 2015
 * @author Jonathan Winters
 *
 */
public class Lab13 {

	public static void main(String[] args) {

		// print what type of loop is being used
		System.out.println("For ------------");
		System.out.println();
		// i = 1, while i <= 2, i will increment
		for (int i = 1; i <= 2; i++) {
			// j = 1, while j <= 4, j will increment
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%3d%3d\n", i, j);
				// print j and i into 2 columns
			}
		}

		// print what type of loop is being used
		System.out.println("\nWhile ----------");
		System.out.println();
		// declare and initialize i1
		int i1 = 0;
		// while i1 < 2: i1 will increment
		while (i1 < 2) {
			i1++;
			int j1 = 0; // declare and initialize j1
			// while j1 < 4, j1 will increment
			while (j1 < 4) {
				j1++;
				System.out.printf("%3d%3d\n", i1, j1);
				// print i1 and j1 into 2 columns
			}
		}

		// print what type of loop is being used
		System.out.println("\nDo-While ------");
		System.out.println();
		// declare and initialize i2
		int i2 = 0;
		// increment i2 while i2 < 2
		do {
			i2++;
			// declare and initialize j2
			int j2 = 0; 
			// increment j2 while j2 < 4
			do {
				j2++;
				System.out.printf("%3d%3d\n", i2, j2);
				// print i2 and j2 into 2 columns
			} while (j2 < 4);
		} while (i2 < 2);
	}
}
