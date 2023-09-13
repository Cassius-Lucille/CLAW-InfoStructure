import java.util.Scanner;

public class Week4Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Establish number of meters per foot
		final double DISTANCERATIO = 0.305;
		
		// Prompt user for number of feet
		System.out.print("Enter a value for distance in feet: ");
		double feet = input.nextDouble();
		
		// Compute value in meters
		double meters = feet * DISTANCERATIO;
		
		// Display result
		System.out.println(feet + " feet is " + meters + " meters");
	}
}