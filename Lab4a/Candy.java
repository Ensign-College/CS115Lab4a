package Lab4a;

public class Candy extends DessertItem {

	double candyWeight;
	double pricePerPound;

	public Candy() {
		super();
		candyWeight = 0;
		pricePerPound = 0.0;
	}
	
	
	public double orderCost() {
		calculateCost();
		return candyWeight;
	}
	/*a new method, calculateCost(), which will override the superclass's method and return the correct cost for the item
Note: The cost of a Sundae is the cost of the ice cream used plus the cost of the topping
	 */
	public Candy(String n, double w, double p) {
		super(n);
		candyWeight = w;
		pricePerPound = p;

	}

	public double getCandyWeight() {
		return candyWeight;
	}
	
	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setCandyWeight(double w) {
		candyWeight = w;
	}
	
	public void setPricePerPound(double p) {
		pricePerPound = p;
	}

	public double calculateCost() {
		double candyCost = pricePerPound * candyWeight;
		return candyCost;
		
	}



}
