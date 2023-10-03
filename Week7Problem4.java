import java.util.Scanner;

public class Week7Problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get edges
		System.out.print("Enter three lengths for each side of a triangle: ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		// Test validity of triangle
		if (edge1 < edge2 + edge3 && edge2 < edge1 + edge3 && edge3 < edge1 + edge2) { // Calculate perimeter
			double perimeter = edge1 + edge2 + edge3;
			
			// Display result
			System.out.println("The perimeter of this triangle is " + perimeter);
		}
		else
			System.out.println("Invalid triangle");
	}
}