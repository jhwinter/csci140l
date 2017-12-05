package Arrays;

public class Copying {

	public static void main(String[] args) {
		
		/*
		 * just some notes to help understand everything else (below)
		int a = 1;
		int b = a;
		b = 2;
		
		String c = new String("blah");
		String d = c;
		
		System.out.println(d);
		
		d = new String("hello");
		
		System.out.println(d);
		System.out.println(c);
		
		
		int c = 2;
		int d = c;
		System.out.println(d);
		d = 3;
		System.out.println(c);
		*/
		
		int[] a = {1000, 1001};
		
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
		a[0] = 2000;
		a[1] = 2001;
		
		Aliasing.print(a);
		Aliasing.print(b);
		
		
	}
}
