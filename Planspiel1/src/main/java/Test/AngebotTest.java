package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Fachkonzept.Angebot;
import Fachkonzept.Produkt;

class AngebotTest {

	private Produkt p1;
	private Angebot a1;
	
	@BeforeEach
	void setUp() throws Exception {
		this.p1 = new Produkt(1, "Tisch");
		this.a1 = new Angebot(p1, 12, 25.2);
		a1.setMenge(15);//zum Konstruktor abweichende Menge testen
	}

	@Test
	void test() {
		assertTrue(this.a1.getId() == p1.prod_id);
		assertTrue(this.a1.getMenge() == 15);
		assertTrue(this.a1.getPreis() == 25.2);
	}

}
