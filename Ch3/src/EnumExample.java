import java.util.Scanner;

/**
 * An example using enums in java
 * @author Jonathan Winters
 *
 */
public class EnumExample {

	// enum must be declared at the class level!
	public enum Color {
		RED, GREEN, BLUE
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a color: ");
		String colorInput = scan.nextLine();
		
		colorInput = colorInput.toLowerCase();
		
		
		Color color = null;
		switch(colorInput){
		case "red":
			color = Color.RED;
			break;
		case "green":
			color = Color.GREEN;
			break;
		case "blue":
			color = Color.BLUE;
			break;
			
			default:
				System.out.println("You did not enter a valid color!");
		}
		
		System.out.println("Color: " + color);
		
		if (color == Color.GREEN){
			System.out.println("Green is my favorite color too!");
		}
		scan.close();
	}
	
}
