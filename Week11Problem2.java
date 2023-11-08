import java.util.Scanner;

public class Week11Problem2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt user for an integer
		System.out.print("Enter a number: ");
		long number = (int)input.nextLong();
		
		// Test secondary method, print result
		System.out.println("The sum of the digits of " + number + " is " + sumDigits(number));
	}
	
	public static int sumDigits(long n) {
		// Add up each digit
		int sum = 0;
		
		for ( ; n > 0; n /= 10)
			sum += n % 10;
		
		return sum;
	}
}