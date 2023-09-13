import java.util.Scanner;

public class Week4Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for a temperature in degrees Celsius
		System.out.print("Enter a value for degrees Celsius: ");
		double celsius = input.nextDouble();
		
		// Compute degrees Fahrenheit
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		// Display result
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}
