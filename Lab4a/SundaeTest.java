package Lab4a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testCalculateCost() {
		Sundae supreme = new Sundae();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(),0,0.001);
	}

	@Test
	void testCalculateTax() {
		Sundae supreme = new Sundae();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(),0 ,0.001);	}

}
