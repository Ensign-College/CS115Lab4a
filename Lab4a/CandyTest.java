package Lab4a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testCalculateCost() {
		Candy supreme = new Candy();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(),0,0.001);
	}

	@Test
	void testCalculateTax() {
		Candy supreme = new Candy();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(),0,0.001);	}
	

}
