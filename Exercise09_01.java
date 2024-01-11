
public class Exercise09_01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle,  width, height,   area, perimeter");
		System.out.printf("%9s, %6.2f, %6.2f, %6.2f, %7.2f\n", "r1", r1.width, r1.height, r1.getArea(), r1.getPerimeter());
		System.out.printf("%9s, %6.2f, %6.2f, %6.2f, %7.2f\n", "r2", r2.width, r2.height, r2.getArea(), r2.getPerimeter());
	}
}

class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
}