package Fachkonzept;

import java.util.ArrayList;
import java.util.List;

public class Markt{
	
	private List<Angebot> angebote = new ArrayList<Angebot>(); 
	
	public void add_angebot(Angebot neu_angebot) {
		this.angebote.add(neu_angebot);
	}
	
	public List<Angebot> getAngebote(){
		return this.angebote;
	}
	
	public void kaufeAngebot(Angebot gek_angebot) {
		
		//Angebot mit der ID suchen
		int len=angebote.size();
		for(int i=0; i<len; i++) {
		    if (angebote.get(i).getId() == (gek_angebot.getId())) {
		        //vorh. Menge > gek. Menge
		    	if(angebote.get(i).getMenge() > gek_angebot.getMenge() ) {
		    		angebote.get(i).setMenge(angebote.get(i).getMenge() - gek_angebot.getMenge());     //vorhandene Menge um gekaufte Menge verringer
		    	}
		    	//vorh. Menge == gek_Menge
		    	else if(angebote.get(i).getMenge() == gek_angebot.getMenge()) {
		    		angebote.remove(i);	//Angebot vom Markt wegnehmen
		    	}
		    	//vorh. Menge < gek. Menge
		    	else {
		    		//Errorhandling
		    	}
		    }
		}
		
	}
	
	public void verkaufeAngebot(Angebot vk_angebot) {
		angebote.add(vk_angebot);
	}
}