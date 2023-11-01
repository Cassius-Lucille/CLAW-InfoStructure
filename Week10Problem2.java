public class Week10Problem2 {
	public static void main(String[] args) {
		// Set kilometers per mile
		final double KMPERMILE = 1.609;
		
		// Display headers
		System.out.printf("%-12s%-12s | %-12s%-12s\n", "Miles", "Kilometers", "Kilometers", "Miles");
		
		// Print table
		for (int leftMiles = 1, rightKM = 20; leftMiles <= 10; leftMiles++, rightKM += 5)
			System.out.printf("%-12d%-12.3f | %-12d%-12.3f\n", leftMiles, (leftMiles * KMPERMILE), rightKM, (rightKM / KMPERMILE));
	}
}