import java.util.Scanner;

public class Week9Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		
		// Compute the hexadecimal equivalent if within range or determine invalidity
		if (decimal >= 0 && decimal < 10)
			System.out.println("The hex value is " + decimal);
		else if (decimal >= 10 && decimal <= 15)
			System.out.println("The hex value is " + (char)('A' + decimal - 10));
		else
			System.out.println(decimal + " is an invalid input");
	}
}