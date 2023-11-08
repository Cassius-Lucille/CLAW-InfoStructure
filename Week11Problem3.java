import java.util.Scanner;

public class Week11Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print(number + " reversed is ");
		reverse(number);
	}
	
	public static void reverse(int number) {
		// Display the number reversed
		for ( ; number > 0; number /= 10)
			System.out.print(number % 10);
		System.out.print("\n");
	}
}