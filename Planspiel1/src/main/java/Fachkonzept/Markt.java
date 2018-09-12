package Fachkonzept;

import java.util.ArrayList;
import java.util.List;

public abstract class  Markt{
	
	private List<Angebot> angebote = new ArrayList<Angebot>(); 
	
	public void add_angebot(Angebot neu_angebot) {
		this.angebote.add(neu_angebot);
	}

	
	public void kaufen(Angebot a, int menge, Unternehmen k) {
		a.setMenge(menge);
		Angebot verbleibendesAngebot = a.kaufen(menge);
		angebote.remove(a);
		if(verbleibendesAngebot != null) {
			angebote.add(verbleibendesAngebot);
		}
		k.verringereKapital(a.getPreis() * menge);
		//unternehmen bezahlt angebot
		
	}
	
	public void kaufen(Angebot a, int menge, Simulation s) {
		a.setMenge(menge);
		Angebot verbleibendesAngebot = a.kaufen(menge);
		angebote.remove(a);
		if(verbleibendesAngebot != null) {
			angebote.add(verbleibendesAngebot);
		}
		//simulation muss nicht bezahlen :)
		
	}
	
	public void anbieten(Angebot a) {
		angebote.add(a);
	}
	
	
	public List<Angebot> getAngebote(){
		return this.angebote;
	}

	public void setAngebote(List<Angebot> angebote) {
		this.angebote = angebote;
	}


}