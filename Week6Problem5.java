import java.util.Scanner;

public class Week6Problem5 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an integer for amount in number of cents: ");
		int amount = input.nextInt();
		int remainingAmount = amount;
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		// Display results
		System.out.println("Your amount " + amount + " consists of");
		if (numberOfOneDollars != 0)
			if (numberOfOneDollars == 1)
				System.out.println("1 dollar");
			else
				System.out.println(numberOfOneDollars + " dollars");
		if (numberOfQuarters != 0)
			if (numberOfQuarters == 1)
				System.out.println("1 quarter");
			else
				System.out.println(numberOfQuarters + " quarters");
		if (numberOfDimes != 0)
			if (numberOfDimes == 1)
				System.out.println("1 dime");
			else
				System.out.println(numberOfDimes + " dimes");
		if (numberOfNickels != 0)
			if (numberOfNickels == 1)
				System.out.println("1 nickel");
			else
				System.out.println(numberOfNickels + " nickels");
		if (numberOfPennies != 0)
			if (numberOfPennies == 1)
				System.out.println("1 penny");
			else
				System.out.println(numberOfPennies + " pennies");
	}
}