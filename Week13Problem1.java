import java.util.Scanner;

public class Week13Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Take input array
		double[][] array = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 4; j++)
				array[i][j] = input.nextDouble();
		
		// Print column sum results with method
		for (int a = 0; a < 3; a++) {
			System.out.print("Sum of the elements at column " + a);
			System.out.printf(" is %1.1f\n", sumColumn(array, a));
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		
		for (int i = 0; i < 3; i++)
			sum += m[i][columnIndex];
		
		return sum;
	}
}