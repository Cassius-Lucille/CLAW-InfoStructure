public class Exercise10_04 {
	public static void main(String[] args) {
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint(10, 30.5);
		
		System.out.println(MyPoint.distance(a, b));
	}
}

class MyPoint {
	private double x;
	private double y;
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public MyPoint() {
		this(0,0);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(double otherX, double otherY) {
		double bigX;
		double bigY;
		double smallX;
		double smallY;
		if (x > otherX) {
			bigX = x;
			smallX = otherX;
		}
		else {
			bigX = otherX;
			smallX = x;
		}
		if (y > otherY) {
			bigY = y;
			smallY = otherY;
		}
		else {
			bigY = otherY;
			smallY = y;
		}
		return Math.sqrt(Math.pow((bigX - smallX),2) + Math.pow((bigY - smallY),2));
	}
	
	public double distance(MyPoint other) {
		return this.distance(other.getX(), other.getY());
	}
	
	public static double distance(MyPoint first, MyPoint second) {
		return first.distance(second);
	}
}