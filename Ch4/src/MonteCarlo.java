/*
 * A monte carlo simulation for estimating Pi
 */
public class MonteCarlo {

	public static void main(String[] args) {

		final int TOTAL = 1000000000;

		int hits = 0; // number of times the point fell in the circle

		for (int i = 1; i <= TOTAL; i++) {
			double x = (Math.random() * 2) - 1;
			double y = (Math.random() * 2) - 1;
			
			//determine if x and y fall in the circle
			if (x*x + y*y <= 1){
				hits++;
			}

		}
		
		// pi = (4*hits) / TOTAL
		double estPi = 4.0 * hits/TOTAL;
		
		System.out.println("Estimate for Pi: " + estPi);
		System.out.println("Pi: " + Math.PI);

	}

}
