import java.util.Scanner;

public class Week9Problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a month: ");
		String month = input.nextLine();
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		switch (month) {
			case "Apr": // intentionally left blank
			case "Jun":
			case "Sep":
			case "Nov":
				System.out.println(month + " " + year + " has 30 days");
				break;
			case "Jan": // intentionally left blank
			case "Mar":
			case "May":
			case "Jul":
			case "Aug":
			case "Oct":
			case "Dec":
				System.out.println(month + " " + year + " has 31 days");
				break;
			case "Feb":
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					System.out.println("month " + month + " of " + year + " has 29 days");
				else
					System.out.println(month + " " + year + " has 28 days");
				break;
			default:
				System.out.println(month + " is not a correct month name");
		}
	}
}