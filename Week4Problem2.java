import java.util.Scanner;

public class Week4Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for radius and length of a cylinder
		System.out.print("Enter two values, for radius then length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		// Compute area
		double area = radius * radius * Math.PI;
		
		// Compute volume
		double volume = area * length;
		
		// Display result
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}