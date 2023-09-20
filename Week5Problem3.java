import java.util.Scanner;

public class Week5Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
		System.out.print("Enter the driving distance: ");
		double milesToDrive = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		// Calculate the gas price for the trip
		double tripCost = pricePerGallon * (milesToDrive / milesPerGallon);
		
		// Display results
		System.out.println("The cost of driving is $" + tripCost);
	}
}