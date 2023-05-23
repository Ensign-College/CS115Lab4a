package Lab4a;

import java.util.ArrayList;

public class Order extends DessertShop{
	//attributes
	
	private ArrayList<DessertItem> OrderArray;


	//Constructor
	public Order() {
		OrderArray = new ArrayList<>();
	}
	
	
	//methods
	public ArrayList<DessertItem> getOrderList(){
		
		return OrderArray;
		
	}// end of getOrderList
	public ArrayList<DessertItem> Add(DessertItem addDesert){
		OrderArray.add(addDesert);
		return OrderArray;
	}// end of Add
	public int itemCount(){
		int counted = OrderArray.size();
		return counted;
	}//end of itemCount
	public double orderCost() {
		double orderResult = 0;
		for(int i=0; i<OrderArray.size(); i++) {
			orderResult = orderResult + OrderArray.get(i).calculateCost();
		}
		return orderResult;
	}
	public double orderTax() {
		double taxResult = 0;
		for(int i = 0; i<OrderArray.size(); i++) {
			taxResult = taxResult + OrderArray.get(i).calculateTax();
		}
		return taxResult;
	}
	
}
