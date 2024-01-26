import java.util.ArrayList;

public class Stack extends ArrayList<Integer> {
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	public int getSize() {
		return size();
		// make sure this works
	}
	
	public Object peek() {
		return get(0);
	}
	
	public Object pop() {
		int value = get(0);
		remove(0); // make sure this reads as the index and not the value.
		return value;
	}
	
	public void push(Integer o) {
		add(0, o);
	}
}