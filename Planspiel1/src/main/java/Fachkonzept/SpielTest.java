package Fachkonzept;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpielTest {

	@Test
	void testNewRound() {
		
		Spiel s = new Spiel();
		
		s.newRound();
		int round = s.getRound();
		assertTrue(s.newRound() == (round + 1));
	}

}
