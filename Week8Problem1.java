import java.util.Scanner;

public class Week8Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		// Prompt user to enter distance
		System.out.print("Enter the distance from the center to a vertex: ");
		double r = input.nextDouble();
	
		// Compute area
		double area = (5 * Math.pow((2 * r * Math.sin(Math.PI / 5)), 2)) / (4 * Math.tan(Math.PI / 5));
	
		// Display result
		System.out.println("The area of the pentagon is " + area);
	}
}