package Lab4a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testGetTaxPercent() {
		Candy supreme = new Candy();
		supreme.getTaxPercent();
		assertEquals(supreme.getTaxPercent(),7.25,0.001);
		
	}

	@Test
	void testSetTaxPercent() {
		Candy supreme = new Candy();
		supreme.setTaxPercent(7.2);
		assertEquals(supreme.getTaxPercent(),7.2,0.001);
	}

}
