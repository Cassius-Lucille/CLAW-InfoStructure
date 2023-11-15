public class Week12Problem5 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[] list = new int[10];
		
		// Test the distinct numbers method
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++)
			list[i] = input.nextInt();
		
		int[] results = eliminateDuplicates(list);
		
		// Display results
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < results.length; i++)
			System.out.print(results[i] + " ");
		System.out.println("");
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		// Count distinct numbers
		int count = 0;
		boolean u = true;
		for (int i = 0; i < list.length; i++, u = true) {
			for (int j = i + 1; j < list.length; j++) {
				if (!u);
				else if (list[i] == list[j])
					u = false;
			}
			if (u)
				count++;
		}
		
		// Create new array of appropriate length
		int[] distinct = new int[count];
		
		// Assign array positions
		count = 0;
		u = true;
		for (int i = 0; count < distinct.length; i++, u = true) {
			for (int j = i + 1; j < list.length; j++) {
				if (!u);
				else if (list[i] == list[j])
					u = false;
			}
			if (u) {
				distinct[count] = list[i];
				count++;
			}
		}
		
		return distinct;
	}
}