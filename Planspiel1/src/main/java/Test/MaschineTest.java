package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Fachkonzept.Maschine;

class MaschineTest {

	private Maschine m1 = new Maschine("Feiler", 2);
	
	@Test
	void test() {
		assertTrue(m1.getId() == 1);
		assertTrue(m1.getBez().equals("Feiler"));
		assertTrue(m1.getKapa() == 2);
	}

}
