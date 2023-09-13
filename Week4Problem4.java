import java.util.Scanner;

public class Week4Problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Establish number of kilograms per pound
		final double WEIGHTRATIO = 0.454;
		
		// Prompt user for number of pounds
		System.out.print("Enter a value for weight in pounds: ");
		double pounds = input.nextDouble();
		
		// Compute value in kilograms
		double kilograms = pounds * WEIGHTRATIO;
		
		// Display result
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
}