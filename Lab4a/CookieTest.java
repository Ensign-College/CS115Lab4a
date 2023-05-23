package Lab4a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {
	@Test
	void testCalculateCost() {
		Cookie supreme = new Cookie();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(),0,0.001);
	}

	@Test
	void testCalculateTax() {
		Cookie supreme = new Cookie();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(),0 ,0.001);	}
	

}
