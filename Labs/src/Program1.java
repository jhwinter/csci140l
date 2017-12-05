import java.util.Scanner;

/**
 * Write a unit conversion program that asks the user from which unit they want
 * to convert (oz, lb, in, ft) and to which unit they want to convert (g, kg,
 * mm, cm, m). Reject incompatible conversions (such as oz --> cm). Ask for the
 * value to be converted, then display the result. I used this source to help me
 * solve this problem:
 * https://github.com/syndbg/Books-solutions/blob/master/Big-Java-for-
 * Everyone-Late-Objects-Horstmann/Chapter-3-Decisions/P3_24.java
 * 
 * September 20, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Program1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // created a scanner

		final double OZ_TO_G = 28.3495; // 1 oz = 28.35 g
		final double OZ_TO_KG = 0.0283495; // 1 oz = 0.02835 kg
		final double LB_TO_G = 453.592; // 1 lb = 453.592 g
		final double LB_TO_KG = .0453592; // 1 lb = 0.453592kg
		final double IN_TO_MM = 25.4; // 1 in = 25.4 mm
		final double IN_TO_CM = 2.54;// 1 in = 2.54 cm
		final double IN_TO_M = 0.254;// 1 in = 0.254 m
		final double FT_TO_MM = 304.8; // 1 ft = 304.8 mm
		final double FT_TO_CM = 30.48; // 1 ft = 30.48 cm
		final double FT_TO_M = 0.3048; // 1 ft = 0.3048 m

		// asks the user for input1
		System.out.print("Convert from? (oz, lb, in, ft) ");
		String input1 = in.next();

		// asks the user for input2
		System.out.print("Convert to? (g, kg, mm, cm, m) ");
		String input2 = in.next();

		// asks the user for what value it is converting
		System.out.print("Value? ");
		double value = in.nextDouble();

		// convert variable converts input1 units to input2 units
		double convert = 0.0;

		if (input1.equals("oz")) {
			if (input2.equals("g")) {
				convert = OZ_TO_G;
			} else if (input2.equals("kg")) {
				convert = OZ_TO_KG;
			}
		}

		if (input1.equals("lb")) {
			if (input2.equals("g")) {
				convert = LB_TO_G;
			} else if (input2.equals("kg")) {
				convert = LB_TO_KG;
			}
		}

		if (input1.equals("in")) {
			if (input2.equals("mm")) {
				convert = IN_TO_MM;
			} else if (input2.equals("cm")) {
				convert = IN_TO_CM;
			} else if (input2.equals("m")) {
				convert = IN_TO_M;
			}
		}

		if (input1.equals("ft")) {
			if (input2.equals("mm")) {
				convert = FT_TO_MM;
			} else if (input2.equals("cm")) {
				convert = FT_TO_CM;
			} else if (input2.equals("m")) {
				convert = FT_TO_M;
			}
		}
		// if the convert variable remains 0.0, then something went wrong
		if (convert == 0.0) {
			System.out.println("Invalid conversion. Please try again.");
			// prints invalid input

		} else { // multiply the value by the conversion rate
			double converted = value * convert;
			System.out.printf("%.6f %s = %.6f %s\n", value, input1, converted, input2);
			// prints the original value and the new value
		}
		in.close(); // close the scanner

	}
}