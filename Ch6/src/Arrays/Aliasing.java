package Arrays;

public class Aliasing {

	public static void main(String[] args) {

		int[] c = new int[2];
		c[0] = 1000;
		c[1] = 1001;

		print(c);

		int[] d = c;
		d[0] = 2000;
		d[1] = 2001;

		print(c);
		
		d = new int[2];
		d[0] = 3000;
		d[1] = 3001;
		
		print(c);
		print(d);

	}

	public static void print(int[] a) {
		int size = a.length;

		for (int i = 0; i < size - 1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[size - 1]);
	}
}
