public class Week13Problem2 {
	/** Main method */
	public static void main(String[] args) {
		// Students' answers to the questions
		char[][] answers = {
			{'A','B','A','C','C','D','E','E','A','D'},
			{'D','B','A','B','C','A','E','E','A','D'},
			{'E','D','D','A','C','B','E','E','A','D'},
			{'C','B','A','E','D','C','E','E','A','D'},
			{'A','B','D','C','C','D','E','E','A','D'},
			{'B','B','E','C','C','D','E','E','A','D'},
			{'B','B','A','C','C','D','E','E','A','D'},
			{'E','B','E','C','C','D','E','E','A','D'}};
		
		// Key to the questions
		char[] keys = {'D','B','D','C','C','D','A','E','A','D'};
		
		// Grade all answers and assign scores
		int[] studentScore = new int[answers.length];
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			
			studentScore[i] = correctCount;
		}
		
		// Print students' scores in order of increasing correct answers
		for (int a = 0; a <= answers[0].length; a++)
			for (int i = 0; i < studentScore.length; i++)
				if (studentScore[i] == a)
					System.out.println("Student " + i + "'s correct count is " + a);
	}
}