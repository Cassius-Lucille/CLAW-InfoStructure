public class Week11Problem5 {
	public static void main(String[] args) {
		System.out.println("Year  # of days");
		// Display the year with the number of days, 2000 to 2020.
		for (int year = 2000; year <= 2020; year++)
			System.out.println(year + "     " + numberOfDaysInAYear(year));
	}
	
	public static int numberOfDaysInAYear(int year) {
		// Is it a leap year?
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			return 366;
		else
			return 365;
	}
}