public class Week12Problem7 {
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		// Initialize the cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		// Shuffle the cards
		for (int i = 0; i< deck.length; i++) {
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		// Pick four cards and calculate the sum. Assume the sequence continues to non-numbered cards.
		int total = 0;
		for (int i = 0; i < 4; i++)
			total += (deck[i] % 13) + 1;
		
		// exercise text: "program should display the number of picks that yields the sum of 24."
		// I couldn't tell what that was supposed to mean in the context of the rest of the exercise. My guess may be inaccurate:
		
		// If the sum is 24, display the numbers of the cards.
		if (total == 24) {
			for (int i = 0; i < 4; i++) {
				String rank = ranks[deck[i] % 13];
				System.out.println("Card number " + deck[i] + ", a " + rank);
			}
		}
	}
}