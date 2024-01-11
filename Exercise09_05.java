
import java.util.GregorianCalendar;

public class Exercise09_05 {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		
		// Display current date
		System.out.println(calendar.get(GregorianCalendar.YEAR) + ", " + calendar.get(GregorianCalendar.MONTH) + " " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		// Set given date and display
		calendar.setTimeInMillis(1234567898765L);
		System.out.println(calendar.get(GregorianCalendar.YEAR) + ", " + calendar.get(GregorianCalendar.MONTH) + " " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
	}
}