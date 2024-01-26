import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 5;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter " + number + " numbers: ");
		for (int i = 0; i < number; i++) {
			list.add(input.nextInt());
		}
		
		sort(list);
		
		System.out.println(list.toString());
	}
	
	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}
	}
}