package Lab4a;

public class IceCream extends DessertItem {
	int scoopCount;
	double pricePerScoop;
	

	public IceCream() {

	}

	public IceCream(String n, int sC, double pPS) {
		super(n);
		scoopCount = sC;
		pricePerScoop = pPS;

	}
	
	

	public int getScoopCount() {
		return scoopCount;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}
	
	public void setScoopCount(int sC) {
		scoopCount = sC;
	}
	
	public void setPricePerScoop(double pPS) {
		pricePerScoop = pPS;
	}
	
	public double calculateCost() {
		double costIceCream = pricePerScoop * scoopCount;
		return costIceCream;
	}
	

}
