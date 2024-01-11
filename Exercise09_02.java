
public class Exercise09_02 {
	public static void main(String[] args) {
		Stock oracle = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
		
		System.out.println("The price change for " + oracle.name + " is %" + oracle.getChangePercent());
	}
}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent() {
		return 100 * ((currentPrice - previousClosingPrice) / previousClosingPrice);
	}
}