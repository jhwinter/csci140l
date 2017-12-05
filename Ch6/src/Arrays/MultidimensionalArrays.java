package Arrays;

import java.util.Scanner;

public class MultidimensionalArrays {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String[][] myFood = new String[3][3];

		final int BREAKFAST = 0;
		final int LUNCH = 1;
		final int DINNER = 2;

		System.out.println("Please enter 3 things you ate at each meal one at a time...");

		for (int i = 0; i < 3; i++) {
			System.out.print("Breakfast: ");
			myFood[BREAKFAST][i] = in.nextLine();
		}

		for (int i = 0; i < 3; i++) {
			System.out.print("Lunch: ");
			myFood[LUNCH][i] = in.nextLine();
		}

		for (int i = 0; i < 3; i++) {
			System.out.print("Dinner: ");
			myFood[DINNER][i] = in.nextLine();
		}
		
		System.out.print("Breakfast: ");
		for(int i=0; i<2; i++){
			System.out.print(myFood[BREAKFAST][i] + ", ");
		}
		System.out.println(myFood[BREAKFAST][2]);
		
		System.out.print("Lunch: ");
		for(int i=0; i<2; i++){
			System.out.print(myFood[LUNCH][i] + ", ");
		}
		System.out.println(myFood[LUNCH][2]);
		
		System.out.print("Dinner: ");
		for(int i=0; i<2; i++){
			System.out.print(myFood[DINNER][i] + ", ");
		}
		System.out.println(myFood[DINNER][2]);
		
		in.close();
	}
}
