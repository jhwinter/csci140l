import java.util.ArrayList;

public class P616 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> stalls = new ArrayList<Boolean>();
		
		//technically, you don't need braces on one-line for loop statements 
		for (int i=0; i<10; i++)
			stalls.add(false);
			
		
		stalls.set(5,  true);
		print(stalls);
		
		stalls.set(2, true);
		print(stalls);
		
		
	}
	
	
	public static void print(ArrayList<Boolean> stalls) {
		
		for (int i = 0; i<stalls.size(); i++) {
			
			if (stalls.get(i)) {
				System.out.print("x");
			}else{
				System.out.print("_ ");
			}
		}
		
		System.out.println();
		
		
	}
	
}
