package Arrays;

import Arrays.Aliasing;

public class ParameterPassing {

	public static void main(String[] args){ 
		
		int[] x = new int[2];
		x[0] = 1000;
		x[1] = 1001;
		
		Aliasing.print(x);
		
		modify(x);
		
		Aliasing.print(x);
		
		modify2(x);
		
		Aliasing.print(x);
		
		x = modify3(x);
		
		Aliasing.print(x);
	}
	
	public static void modify (int[] a) {
		
		if (a.length < 2){
			System.out.println("Error: Array too small!");
			return;
		}
		a[0] = 2000;
		a[1] = 2001;
		
	}
	
	public static void modify2(int[] a){
		
		a = new int[2];
		a[0] = 3000;
		a[1] = 3001;
		
	}
	
	public static int[] modify3(int[] a){
		a = new int[2];
		a[0] = 4000;
		a[1] = 4001;
		return a;
	}
}
