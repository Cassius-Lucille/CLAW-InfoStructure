import java.util.Scanner;

public class Week8Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for side number and length
		System.out.print("Enter the number of sides: ");
		double n = input.nextDouble();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		// Compute area
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		
		// Display result
		System.out.println("The area of the polygon is " + area);
	}
}