public class Week8Problem4 {
	public static void main(String[] args) {
		final double RADIUS = 40;
		
		// Generate three random points on the circle
		double angle = Math.random() * 2 * Math.PI;
		double x1 = RADIUS * Math.cos(angle);
		double y1 = RADIUS * Math.sin(angle);
		angle = Math.random() * 2 * Math.PI;
		double x2 = RADIUS * Math.cos(angle);
		double y2 = RADIUS * Math.sin(angle);
		angle = Math.random() * 2 * Math.PI;
		double x3 = RADIUS * Math.cos(angle);
		double y3 = RADIUS * Math.sin(angle);
		
		// Determine the distances between these points
		double a = Math.sqrt((x2-x3) * (x2-x3) + (y2-y3) * (y2-y3));
		double b = Math.sqrt((x1-x3) * (x1-x3) + (y1-y3) * (y1-y3));
		double c = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
		// Determine the angles between these points
		double A = Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c*c - b*b - a*a) / (-2 * b * a)));
		
		// Display results
		System.out.println("The three angles are " + A + " " + B + " " + C);
	}
}