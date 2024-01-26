public class Exercise11_10 {
	public static void main(String[] args) {
		Stack tower = new Stack();
		
		System.out.println("Tower is empty? " + tower.isEmpty());
		
		tower.push(1);
		tower.push(2);
		tower.push(3);
		
		System.out.println("Tower is empty? " + tower.isEmpty());
		System.out.println("Tower is " + tower.getSize() + " pieces tall");
		
		System.out.println(tower.peek() + " is on top");
	}
}