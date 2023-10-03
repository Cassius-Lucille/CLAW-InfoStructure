import java.util.Scanner;

public class Week7Problem3 {
	public static void main(String[] args) {
		// Generate a coin flip, numerical equivalent
		int flip = (int)(Math.random() * 2);
		
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your prediction (0: heads, 1: tails): ");
		int guess = input.nextInt();
		
		// Interpret coin flip
		System.out.print("The coin landed ");
		if (flip == 0)
			System.out.println("heads");
		else
			System.out.println("tails");
		
		// Check the guess
		if (guess == flip)
			System.out.println("You guessed correctly!");
		else
			System.out.println("Your guess was incorrect");
	}
}