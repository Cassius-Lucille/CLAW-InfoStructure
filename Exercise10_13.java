public class Exercise10_13 {
	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("Area is " + r1.getArea());
		System.out.println("Perimeter is " + r1.getPerimeter());
		System.out.println("Does it contain the point (3, 3)? " + r1.contains(3, 3));
		System.out.println("Does it contain the given rectangle? " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("Does it overlap the other given rectangle? " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}

class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public MyRectangle2D() {
		x = 0;
		y = 0;
		width = 1;
		height = 1;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return x * y;
	}
	
	public double getPerimeter() {
		return 2 * (x + y);
	}
	
	public boolean contains(double x, double y) {
		return (x < this.x + (width / 2) && x > this.x - (width / 2) && y < this.y + (height / 2) && y > this.y - (height / 2));
	}
	
	public boolean contains(MyRectangle2D r) {
		return (r.x + (r.width / 2) < x + (width / 2) && r.x - (r.width / 2) > x - (width / 2) && r.y + (r.height / 2) < y + (height / 2) && r.y - (r.height / 2) > y - (height / 2));
	}
	
	public boolean overlaps(MyRectangle2D r) {
		double firstTopX = x + (width / 2);
		double firstTopY = y + (height / 2);
		double secondTopX = r.x + (r.width / 2);
		double secondTopY = r.y + (r.height / 2);
		double firstBottomX = x - (width / 2);
		double firstBottomY = y - (height / 2);
		double secondBottomX = r.x - (r.width / 2);
		double secondBottomY = r.y - (r.height / 2);
		
		return ((((firstTopX < secondTopX && firstTopX > secondBottomX) || (firstBottomX < secondTopX && firstBottomX > secondBottomX)) || ((secondTopX < firstTopX && secondTopX > firstBottomX) || (secondBottomX < firstTopX && secondBottomX > firstBottomX))) && (((firstTopY < secondTopY && firstTopY > secondBottomY) || (firstBottomY < secondTopY && firstBottomY > secondBottomY)) || ((secondTopY < firstTopY && secondTopY > firstBottomY) || (secondBottomY < firstTopY && secondBottomY > firstBottomY))));
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}