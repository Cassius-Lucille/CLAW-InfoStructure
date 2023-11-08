public class Week11Problem1 {
	public static void main(String[] args) {
		final int NUMBER_OF_PENTAGONALS = 100;
		final int PENTAGONALS_PER_LINE = 10;
		
		// Test the secondary method, print lines
		for (int a = 1; a <= NUMBER_OF_PENTAGONALS; a++) {
			System.out.printf("%7d", getPentagonalNumber(a));
			if (a % PENTAGONALS_PER_LINE == 0)
				System.out.print("\n");
		}
	}
	
	public static int getPentagonalNumber(int n) {
		// Calculate the nth pentagonal number
		int pentagonal = n  * ((3 * n) - 1) / 2;
		
		return pentagonal;
	}
}