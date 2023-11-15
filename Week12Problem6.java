public class Week12Problem6 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Get number of entries
		System.out.print("Enter number of students: ");
		int students = input.nextInt();
		
		String[] names = new String[students];
		double[] scores = new double[students];
		
		// Take names and scores
		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter student name with their score: ");
			names[i] = input.next(); // says to use nextLine but it doesn't work
			scores[i] = input.nextDouble();
		}
		
		// Order entries by score
		sortByScore(names, scores);
		
		// Display names in decreasing order of score
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	public static void sortByScore(String[] names, double[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			// Find the minimum score
			double currentMin = scores[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < scores.length; j++) {
				if (currentMin < scores[j]) {
					currentMin = scores[j];
					currentMinIndex = j;
				}
			}
		
			// Swap scores[i] with scores[currentMinIndex], if necessary. Perform the corresponding swap also to names.
			if (currentMinIndex != i) {
				String temp = names[currentMinIndex];
				scores[currentMinIndex] = scores[i];
				names[currentMinIndex] = names[i];
				scores[i] = currentMin;
				names[i] = temp;
			}
		}
	}
}