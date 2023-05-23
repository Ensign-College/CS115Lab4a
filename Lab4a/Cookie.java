package Lab4a;

public class Cookie extends DessertItem {
	int cookieQty;
	double pricePerDozen;

	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen= 0;
		}
	/*a new method, calculateCost(), which will override the superclass's method and return the correct cost for the item
Note: The cost of a Sundae is the cost of the ice cream used plus the cost of the topping
	 */
	public Cookie(String n, int q, double p) {
		super(n);
		cookieQty = q;
		pricePerDozen = p;

		}
	
	public int getCookieQty() {
		return cookieQty;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}
	
	public void setCookieQty(int q) {
	cookieQty = q;
	}
	
	public void setToppingPricePricePerDozen(double p) {
		pricePerDozen = p;
	}
	@Override
	public double calculateCost() {
		double cookieCost = cookieQty * (pricePerDozen/12);
		return cookieCost;
		
	}
}

	
	

