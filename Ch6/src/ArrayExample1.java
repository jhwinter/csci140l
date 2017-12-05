import java.util.Scanner;

/**
 * Read in 5 names from the console, store them in an array, iterate over
 * the array and output each element
 * @author jtwinters
 *
 */

public class ArrayExample1 {

	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String[] names = new String[5];
		
		for(int i=0; i < names.length; i++){
			System.out.print("Name: ");
			names[i] = in.nextLine();
		}
		
		System.out.println("\n-------\n");
		
		System.out.println("Last name in array: " + names[names.length - 1]);
		System.out.println("Second name in array: " + names[1]);
		
		/*
		for(int i=0; i< names.length; i++){
			String name = names[i];
			System.out.println("names[" + i + "] = " + name);
			
		}
		*/
		
		names = bubbleSort(names);
		
		System.out.println("\n-------\n");
		//enhanced for-loop
		for (String name : names){
			System.out.println("Name = " + name);
		}
		
		
		
		in.close();
	}
	
	public static String[] bubbleSort(String[] a){
		int n = a.length;
		boolean swapped = false;
		do{
			swapped = false;
			for (int i = 1; i < n; i++){
				/*
				 * CompareTo: 0 if arg is equal to string
				 * 			  pos if arg comes before string
				 *            neg if arg comes after string
				 *            string.compareTo(arg)
				 */
				if (a[i].compareTo(a[i-1]) < 0){
					//swap
					String tmp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = tmp;
					swapped = true;
				}
				
			}	
		}while (swapped);
		return a;
	}
	
	
	
}
