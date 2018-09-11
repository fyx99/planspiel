package Fachkonzept;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Fachkonzept.ProductSet;

class ProductSetTest {

	ProductSet testClass = new ProductSet(5);
	
	@Test
	void test() {
		assertEquals("Tisch", testClass.ps[0].prod_name, "Falscher Produktname im ProductSet");
		
	}

}
