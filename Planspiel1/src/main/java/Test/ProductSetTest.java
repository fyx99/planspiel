package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Fachkonzept.ProduktSet;

class ProductSetTest {

	ProduktSet testClass = new ProduktSet(5);
	
	@Test
	void test() {
		assertEquals("Tisch", testClass.ps[0].prod_name, "Falscher Produktname im ProductSet");
		
	}

}
