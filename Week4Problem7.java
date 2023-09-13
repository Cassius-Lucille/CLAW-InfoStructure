public class Week4Problem7 {
	public static void main(String[] args) {
		// Establish values for calculation
		int a = 1, b = 2;
		int power = (int) Math.pow(a,b); // Double result casted to integer
		
		// Table labels
		System.out.println("a   b   pow(a, b)");
		// Table contents
		System.out.println(a++ + "   " + b++ + "   " + power); // Print a, b, and power for this step, then increment a and b
		power = (int) Math.pow(a,b); // Adjust power to match the new values of a and b
		// Repeat the above steps for other lines.
		System.out.println(a++ + "   " + b++ + "   " + power);
		power = (int) Math.pow(a,b);
		System.out.println(a++ + "   " + b++ + "   " + power);
		power = (int) Math.pow(a,b);
		System.out.println(a++ + "   " + b++ + "   " + power);
		power = (int) Math.pow(a,b);
		System.out.println(a + "   " + b + "   " + power);
	}
}