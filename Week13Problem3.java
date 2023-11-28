public class Week13Problem3 {
	public static void main(String[] args) {
		// Initialize matrix and fill in random values
		int[][] matrix = new int[4][4];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				matrix[i][j] = (int)(Math.random() * 2);
		
		// Print the matrix
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.print(matrix[i][j]);
			System.out.println();
		}
		
		// Compare column and row sums
		int greatestRowIndex = 0;
		for (int i = 0; i < 4; i++) {
			int greatestSum = 0;
			if (rowSum(matrix, i) > greatestSum) {
				greatestRowIndex= i;
				greatestSum = rowSum(matrix, i);
			}
		}
		int greatestColumnIndex = 0;
		for (int i = 0; i < 4; i++) {
			int greatestSum = 0;
			if (columnSum(matrix, i) > greatestSum) {
				greatestColumnIndex= i;
				greatestSum = columnSum(matrix, i);
			}
		}
		
		// Display results
		System.out.println("The largest row index: " + greatestRowIndex);
		System.out.println("The largest column index: " + greatestColumnIndex);
	}

	public static int rowSum(int[][] a, int b) {
		int total = 0;
		for (int column = 0; column < a[0].length; column++) {
				total+= a[b][column];
		}
		
		return total;
	}
	
	public static int columnSum(int[][] a, int b) {
		int total = 0;
		for (int row = 0; row < a.length; row++) {
			total+= a[row][b];
		}
		
		return total;
	}
}