public class Week10Problem1 {
	public static void main(String[] args) {
		// Set kilometers per mile
		final double KMPERMILE = 1.609;
		
		// Display headers
		System.out.printf("%-12s%-12s\n", "Miles", "Kilometers");
		
		// Print table
		for (int miles = 1; miles <= 10; miles++)
			System.out.printf("%-12d%-12.3f\n", miles, (miles * KMPERMILE));
	}
}