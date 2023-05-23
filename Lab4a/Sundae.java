package Lab4a;

public class Sundae extends IceCream {

	String toppingName;
	double toppingPrice;

	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0.00;
		
	}


	public Sundae(String n, int sC, double pPS, String tN, double tP) {
		super(n, sC, pPS);
		toppingName = tN;
		toppingPrice = tP;

	}
	public String getToppingName() {
		return toppingName;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}
	
	public void setToppingName(String tN) {
	toppingName = tN;
	}
	
	public void setToppingPrice(double tP) {
		toppingPrice = tP;
	}
	


	public double calculateCost() {
		double totals = super.calculateCost() + toppingPrice;
		return totals;
	}
}

