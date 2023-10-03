import java.util.Scanner;

public class Week7Problem2 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter filing status
		System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");

		int status = input.nextInt();

		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		// Compute tax
		double tax = 0;
		
		// I had to look up most of these; I've chosen to update the numbers from what they were in the book to match.
		switch (status) {
		case 0: // Compute tax for single filers
			if (income <= 11000)
				tax = income * 0.10;
			else if (income <= 44725)
				tax = 11000 * 0.10 + (income - 11000) * 0.12;
			else if (income <= 95375)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (income - 44725) * 0.22;
			else if (income <= 182100)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24;
			else if (income <= 231250)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24 + (income - 182100) * 0.32;
			else if (income <= 578125)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24 + (income - 182100) * 0.32 + (income - 231250) * 0.35;
			else
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24 + (income - 182100) * 0.32 + (income - 231250) * 0.35 + (income - 578125) * 0.37;
			break;
		case 1: // Compute tax for married file jointly or qualifying widow(er)
			if (income <= 22000)
				tax = income * 0.10;
			else if (income <= 89450)
				tax = 22000 * 0.10 + (income - 22000) * 0.12;
			else if (income <= 190750)
				tax = 22000 * 0.10 + (89450 - 22000) * 0.12 + (income - 89450) * 0.22;
			else if (income <= 364200)
				tax = 22000 * 0.10 + (89450 - 22000) * 0.12 + (190750 - 89450) * 0.22 + (income - 190750) * 0.24;
			else if (income <= 462500)
				tax = 22000 * 0.10 + (89450 - 22000) * 0.12 + (190750 - 89450) * 0.22 + (income - 190750) * 0.24 + (income - 364200) * 0.32;
			else if (income <= 693750)
				tax = 22000 * 0.10 + (89450 - 22000) * 0.12 + (190750 - 89450) * 0.22 + (income - 190750) * 0.24 + (income - 364200) * 0.32 + (income - 462500) * 0.35;
			else
				tax = 22000 * 0.10 + (89450 - 22000) * 0.12 + (190750 - 89450) * 0.22 + (income - 190750) * 0.24 + (income - 364200) * 0.32 + (income - 462500) * 0.35 + (income - 693750) * 0.37;
			break;
		case 2: // Compute tax for married separately
			if (income <= 11000)
				tax = income * 0.10;
			else if (income <= 44725)
				tax = 11000 * 0.10 + (income - 11000) * 0.12;
			else if (income <= 95375)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (income - 44725) * 0.22;
			else if (income <= 182100)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24;
			else if (income <= 231250)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24 + (income - 182100) * 0.32;
			else if (income <= 346875)
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24 + (income - 182100) * 0.32 + (income - 231250) * 0.35;
			else
				tax = 11000 * 0.10 + (44725 - 11000) * 0.12 + (95375 - 44725) * 0.22 + (income - 95375) * 0.24 + (income - 182100) * 0.32 + (income - 231250) * 0.35 + (income - 346875) * 0.37;
			break;
		case 3: // Compute tax for head of household
			if (income <= 15700)
				tax = income * 0.10;
			else if (income <= 59850)
				tax = 15700 * 0.10 + (income - 15700) * 0.12;
			else if (income <= 95350)
				tax = 15700 * 0.10 + (59850 - 15700) * 0.12 + (income - 59850) * 0.22;
			else if (income <= 182100)
				tax = 15700 * 0.10 + (59850 - 15700) * 0.12 + (95350 - 59850) * 0.22 + (income - 95350) * 0.24;
			else if (income <= 231250)
				tax = 15700 * 0.10 + (59850 - 15700) * 0.12 + (95350 - 59850) * 0.22 + (income - 95350) * 0.24 + (income - 182100) * 0.32;
			else if (income <= 578100)
				tax = 15700 * 0.10 + (59850 - 15700) * 0.12 + (95350 - 59850) * 0.22 + (income - 95350) * 0.24 + (income - 182100) * 0.32 + (income - 231250) * 0.35;
			else
				tax = 15700 * 0.10 + (59850 - 15700) * 0.12 + (95350 - 59850) * 0.22 + (income - 95350) * 0.24 + (income - 182100) * 0.32 + (income - 231250) * 0.35 + (income - 578100) * 0.37;
			break;
		default:
			System.out.println("Error: invalid status");
			System.exit(1);
			break;
		}

		// Display the result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}
}