package Fachkonzept;

import java.util.ArrayList;
import java.util.List;

public abstract class  Markt{
	
	private List<Angebot> angebote = new ArrayList<Angebot>(); 
	
	public void angebotHinzu(Angebot a) {
		this.angebote.add(a);
	}

	
	public void kaufen(Angebot a, int menge, Unternehmen k) {
		Angebot verbleibendesAngebot = a.kaufen(menge);
		angebote.remove(a);
		if(verbleibendesAngebot != null) {
			angebote.add(verbleibendesAngebot);
		}
		k.verringereKapital(a.getPreis() * menge);
		//unternehmen bezahlt angebot
		
	}
	
	public void kaufen(Angebot a, int menge, Simulation s) {
		Angebot verbleibendesAngebot = a.kaufen(menge);
		angebote.remove(a);
		if(verbleibendesAngebot != null) {
			angebote.add(verbleibendesAngebot);
		}
		//simulation muss nicht bezahlen :)
		//die einlagerung ist in der sub class
		
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