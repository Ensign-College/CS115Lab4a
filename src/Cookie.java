
public class Cookie extends DessertItem {
	int cookieQty;
	double pricePerDozen;

	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen = 0;
	}

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

}
