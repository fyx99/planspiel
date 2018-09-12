package Fachkonzept;

import java.util.Iterator;
import java.util.List;


public class Simulation {

	public Simulation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void simuliere(Spiel s, List<Unternehmen> us) {
		

		
		Iterator<Unternehmen> i = us.iterator();
		while(i.hasNext()) {
			Unternehmen n = i.next();
			n.verringereKapital(6);
			
			if(s.getRunde() == 1) {
				n.setBmarkt(beschaffungsmarktDemoDaten());
				n.setMmarkt(maschinenmarktDemoDaten());
			}
			
			
			
		}
	}
	
	private static Beschaffungsmarkt beschaffungsmarktDemoDaten() {
		AHolz ah = new AHolz(1);
		AHolz bh = new AHolz(1);
		Beschaffungsmarkt b = new Beschaffungsmarkt();
		b.anbieten(new Angebot(ah, 99, 3));
		b.anbieten(new Angebot(bh, 59, 1));
		
		return b;
	}
	private static Maschinenmarkt maschinenmarktDemoDaten() {
		Maschine m1 = new Maschine("beispielmaschine", 1);
		Maschine m2 = new Maschine("beispielmaschine2", 1);
		Maschinenmarkt b = new Maschinenmarkt();
		b.anbieten(new Angebot(m1, 3, 888));
		b.anbieten(new Angebot(m2, 1, 34));
		
		return b;
	}

}
