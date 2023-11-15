public class Week12Problem1 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Take count of students
		System.out.print("Enter the number of students: ");
		int studentCount = input.nextInt();	
		
		// Take scores
		int[] scores = new int[studentCount];
		System.out.print("Enter " + studentCount + " scores: ");
		for (int i = 0; i < scores.length; i++)
			scores[i] = input.nextInt();
		
		// Get best score, record
		int topScore = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > topScore)
				topScore = scores[i];
		}
			
		
		// For each student, print assessment line
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= (topScore - 10))
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
			else if (scores[i] >= (topScore - 20))
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
			else if (scores[i] >= (topScore - 30))
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
			else if (scores[i] >= (topScore - 40))
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
			else
				System.out.println("Student " + i + " score is " + scores[i] + " and grade is E");
		}
	}
}