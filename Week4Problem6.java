import java.util.Scanner;

public class Week4Problem6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for velocity and acceleration
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		// Compute minimum runway length
		double length = (Math.pow(speed,2)) / (2 * acceleration);
		
		// Display result
		System.out.println("The minimum runway length for this airplane is " + length);
	}
}