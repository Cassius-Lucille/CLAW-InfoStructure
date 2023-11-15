public class Week12Problem3 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double[] list = new double[10];
		
		// Test the double average method
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++)
			list[i] = input.nextDouble();
		
		// Display results
		System.out.println("The average of these numbers is " + average(list));
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		int average = sum / array.length;
		return average;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		double average = sum / array.length;
		return average;
	}
}