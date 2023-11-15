public class Week12Problem2 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[] list = new int[10];
		
		System.out.print("Enter 10 numbers: ");
		for (int i = 9; i >= 0; i--)
			list[i] = input.nextInt();
		
		System.out.print("The reverse is ");
		for (int i = 0; i < 10; i++)
			System.out.print(list[i] + " ");
		System.out.println("");
	}
}