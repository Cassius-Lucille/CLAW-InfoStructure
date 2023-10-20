public class Week8Problem2 {
	public static void main(String[] args) {
		// get coordinates
		double atlantaLatitude = 33.7489954;
		double atlantaLongitude = -84.3879824;
		double charlotteLatitude = 35.2270869;
		double charlotteLongitude = -80.8431267;
		double orlandoLatitude = 28.5383355;
		double orlandoLongitude = -81.3792365;
		double savannahLatitude = 32.0835407;
		double savannahLongitude = -81.0998342;
		final double EARTHRADIUS = 6371.01;
		
		// compute the needed distances
		double atlantaToSavannah = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(atlantaLatitude)) * Math.sin(Math.toRadians(savannahLatitude)) + Math.cos(Math.toRadians(atlantaLatitude)) * Math.cos(Math.toRadians(savannahLatitude)) * Math.cos(Math.toRadians(atlantaLongitude - savannahLongitude)));
		double atlantaToCharlotte = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(atlantaLatitude)) * Math.sin(Math.toRadians(charlotteLatitude)) + Math.cos(Math.toRadians(atlantaLatitude)) * Math.cos(Math.toRadians(charlotteLatitude)) * Math.cos(Math.toRadians(atlantaLongitude - charlotteLongitude)));
		double atlantaToOrlando = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(atlantaLatitude)) * Math.sin(Math.toRadians(orlandoLatitude)) + Math.cos(Math.toRadians(atlantaLatitude)) * Math.cos(Math.toRadians(orlandoLatitude)) * Math.cos(Math.toRadians(atlantaLongitude - orlandoLongitude)));
		double charlotteToSavannah = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(charlotteLatitude)) * Math.sin(Math.toRadians(savannahLatitude)) + Math.cos(Math.toRadians(charlotteLatitude)) * Math.cos(Math.toRadians(savannahLatitude)) * Math.cos(Math.toRadians(charlotteLongitude - savannahLongitude)));
		double orlandoToSavannah = EARTHRADIUS * Math.acos(Math.sin(Math.toRadians(orlandoLatitude)) * Math.sin(Math.toRadians(savannahLatitude)) + Math.cos(Math.toRadians(orlandoLatitude)) * Math.cos(Math.toRadians(savannahLatitude)) * Math.cos(Math.toRadians(orlandoLongitude - savannahLongitude)));
		
		// compute areas of triangles and sum
		double upperS = (atlantaToSavannah + atlantaToCharlotte + charlotteToSavannah) / 2;
		double upperArea = Math.sqrt(upperS * (upperS - atlantaToSavannah) * (upperS - atlantaToCharlotte) * (upperS - charlotteToSavannah));
		double lowerS = (atlantaToSavannah + atlantaToOrlando + orlandoToSavannah) / 2;
		double lowerArea = Math.sqrt(lowerS * (lowerS - atlantaToSavannah) * (lowerS - atlantaToOrlando) * (lowerS - orlandoToSavannah));
		double area = upperArea + lowerArea;
		
		// display answer
		System.out.println("The area enclosed by Atlanta, Charlotte, Orlando, and Savannah is " + area + " square kilometers");
	}
}