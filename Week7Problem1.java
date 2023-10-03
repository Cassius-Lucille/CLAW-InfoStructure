import java.util.Scanner;

public class Week7Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number 1-12 for the month: ");
		int month = input.nextInt();
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		switch (month) {
			case 4: // intentionally left blank
			case 6:
			case 9:
			case 11: System.out.println("month " + month + " has 30 days");
				break;
			case 1: // intentionally left blank
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("month " + month + " has 31 days");
				break;
			case 2: if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					System.out.println("month " + month + " of " + year + " has 29 days");
				else
					System.out.println("month " + month + " of " + year + " has 28 days");
				break;
		}
	}
}