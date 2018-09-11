package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Fachkonzept.Angebot;
import Fachkonzept.Produkt;

class AngebotTest {
	
	private Produkt p1 = new Produkt(1, "Tisch");
	private Angebot a1 = new Angebot(p1, 12, 25.2);
	
	@Test
	void test() {
		assertTrue(a1.getId() == p1.prod_id);
		assertTrue(a1.getMenge() == 12);
		assertTrue(a1.getPreis() == 25.2);
	}

}
