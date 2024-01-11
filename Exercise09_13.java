
public class Exercise09_13 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		double[][] array = new double[rows][columns];
		
		// Take values to fill cells
		System.out.println("Enter the array:");
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				array[i][j] = input.nextDouble();
		
		System.out.println("The location of the largest element is " + locateLargest(array).maxValue + " at (" + locateLargest(array).row + ", " + locateLargest(array).column + ")");
	}
	
	public static Location locateLargest(double[][] a) {
		Location location = new Location();
		
		location.maxValue = a[0][0];
		location.row = 0;
		location.column = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				if (a[i][j] > location.maxValue) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
		
		return location;
	}
}

class Location {
	public int row;
	public int column;
	public double maxValue;
}