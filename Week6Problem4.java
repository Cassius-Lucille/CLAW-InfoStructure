import java.util.Scanner;

public class Week6Problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the day as an integer
		System.out.print("Enter today's day: ");
		int weekday = input.nextInt();
		
		// Prompt user for days elapsed
		System.out.print("Enter the number of days elapsed since today: ");
		int daysSinceToday = input.nextInt();
		
		// Calculate future weekday
		int futureWeekday = (weekday + daysSinceToday) % 7;
		
		// Print results
		System.out.print("Today is ");
		if (weekday == 0) 
			System.out.print("Sunday");
		else if (weekday == 1)
			System.out.print("Monday");
		else if (weekday == 2)
			System.out.print("Tuesday");
		else if (weekday == 3)
			System.out.print("Wednesday");
		else if (weekday == 4)
			System.out.print("Thursday");
		else if (weekday == 5)
			System.out.print("Friday");
		else
			System.out.print("Saturday");
		System.out.print(" and the future day is ");
		if (futureWeekday == 0) 
			System.out.println("Sunday");
		else if (futureWeekday == 1)
			System.out.println("Monday");
		else if (futureWeekday == 2)
			System.out.println("Tuesday");
		else if (futureWeekday == 3)
			System.out.println("Wednesday");
		else if (futureWeekday == 4)
			System.out.println("Thursday");
		else if (futureWeekday == 5)
			System.out.println("Friday");
		else
			System.out.println("Saturday");
	}
}