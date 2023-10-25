import java.util.Scanner;

public class Week9Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter a hex digit: ");
		String entry = input.nextLine();
		char hex = entry.charAt(0);
		
		if (entry.length() != 1)
			System.out.println(entry + " is an invalid input");
		System.exit(1);
		
		int decimal = 0;
		
		// Compute decimal equivalent
		if (Character.isDigit(hex))
			decimal = hex - '0';
		else if (Character.isUpperCase(hex))
			decimal = hex - 'A' + 10;
		else {
			System.out.println(hex + " is an invalid input");
			System.exit(1);
		}
		
		String binary = "";
		
		// Compute binary equivalent
		if (decimal >= 8) {
			binary = binary + "1";
			decimal -= 8;
		}
		else
			binary = binary + "0";
		
		if (decimal >= 4) {
			binary = binary + "1";
			decimal -= 4;
		}
		else
			binary = binary + "0";
		
		if (decimal >= 2) {
			binary = binary + "1";
			decimal -= 2;
		}
		else
			binary = binary + "0";
		
		if (decimal >= 1) {
			binary = binary + "1";
			decimal -= 1;
		}
		else
			binary = binary + "0";
		
		// Display result
		System.out.println("The binary value is " + binary);
	}
}