import java.util.Scanner;

public class Week5Problem1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// Enter balance and interest rate
	System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
	double balance = input.nextDouble();
	double annualInterestRate = input.nextDouble();
	
	// Compute the interest
	double monthlyInterest = balance * (annualInterestRate / 1200);
	
	// Display results
	System.out.println("The interest is " + monthlyInterest);
	}
}