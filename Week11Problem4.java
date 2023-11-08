import java.util.Scanner;

public class Week11Problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input values
		System.out.print("The amount invested: ");
		double initialAmount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualRate = input.nextInt();
		
		// Print table: headers, then rows
		System.out.printf("%-8s %16s", "Years", "Future Value\n");
		for (int years = 1; years <= 30; years++)
			System.out.printf("%-2d      %8.2f\n", years, futureInvestmentValue(initialAmount, (annualRate * 0.01) / 12, years));
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		// Calculate investment value
		double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (12 * years));
		
		return futureValue;
	}
}