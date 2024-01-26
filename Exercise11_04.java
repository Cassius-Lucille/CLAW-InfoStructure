import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter numbers, end with 0: ");
		int j;
		do {
			j = input.nextInt();
			if (!list.contains(j) && j != 0)
				list.add(j);
		} while (j != 0);
		
		System.out.println("The greatest of these is " + max(list));
	}
	
	public static Integer max(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
}