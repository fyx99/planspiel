package Fachkonzept;

import java.util.Iterator;
import java.util.List;


public class Simulation {

	public Simulation() {
		// TODO Auto-generated constructor stub
	}
	
	public static void simuliere(List<Unternehmen> us) {
		
		Iterator<Unternehmen> i = us.iterator();
		while(i.hasNext()) {
			i.next().verringereKapital(6);
			
		}
	}

}
