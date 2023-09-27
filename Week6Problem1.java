import java.util.Scanner;

public class Week6Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for coefficients
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculate discriminant
		double discriminant = (b * b) - (4 * a * c);
		
		double root1 = 0;
		
		// Compensate for doubles
		final double EPSILON = 1E-14;
		
		if (discriminant < (0 - EPSILON)) // Case for discriminant less than 0
			System.out.println("The equation has no real roots");
		else if (Math.abs(discriminant) < EPSILON) { // Case for discriminant 0
			root1 = -b / (2 * a);
			System.out.println("The equation has one root " + root1);
		}
		else { // Case for positive discriminant
			root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + root1 + " and " + root2);
		}
	}
}