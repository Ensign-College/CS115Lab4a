package Lab4a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void testCalculateCost() {
		IceCream supreme = new IceCream();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(),0,0.001);
	}

	@Test
	void testCalculateTax() {
		IceCream supreme = new IceCream();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(),0 ,0.001);	}

}
