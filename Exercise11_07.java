import java.util.ArrayList;

public class Exercise11_07 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int length = 16;
		
		for (int i = 0; i < length; i++) {
			list.add(i);
		}
		System.out.println("Before shuffle:");
		System.out.println(list.toString());
		
		shuffle(list);
		System.out.println("After shuffle:");
		System.out.println(list.toString());
	}
	
	public static void shuffle(ArrayList<Integer> list) {
		for (int i = 0, j = 0, temp = 0; i < list.size(); i++) {
			j = (int)(list.size() * Math.random());
			temp = list.get(j);
			list.set(j, list.get(i));
			list.set(i, temp);
		}
	}
}