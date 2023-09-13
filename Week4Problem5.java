import java.util.Scanner;

public class Week4Problem5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for offset
		System.out.print("Enter the time zone offset to GMT: ");
		double offset = input.nextDouble();
		
		// Retrieve and compute total time measures since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		
		// Compute current hour, accounting for offset
		long currentHour = (long) (offset + totalHours) % 24;
		
		// Compute the rest of the measures of the current time
		long currentMinute = totalMinutes % 60;
		long currentSecond = totalSeconds % 60;
		
		// Display results
		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
}