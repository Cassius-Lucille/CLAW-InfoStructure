public class Week12Problem4 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double[] list = new double[10];
		
		// Test the reverse method
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++)
			list[i] = input.nextDouble();
		
		// Display results
		list = reverse(list);
		System.out.print("The reverse is ");
		for (int i = 0; i < 10; i++)
			System.out.print(list[i] + " ");
		System.out.println("");
	}
	
	public static double[] reverse(double[] list) {
		for (int i = 0, j = list.length-1; i < j; i++, j--) {
			double temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
		return list;
	}
}