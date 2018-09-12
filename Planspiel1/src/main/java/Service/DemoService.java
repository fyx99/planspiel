package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Fachkonzept.Angebot;
import Fachkonzept.Beschaffungsmarkt;
import Fachkonzept.Markteinheit;
import Fachkonzept.Maschine;
import Fachkonzept.Maschinenmarkt;
import Fachkonzept.Material;
import Fachkonzept.Spiel;
import Fachkonzept.Unternehmen;
import Fachkonzept.Verkaufsmarkt;

/**
 * Root resource (exposed at "myresource" path)
 */
@PermitAll
@Path("demo")
public class DemoService {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */

	private static Spiel s;

	@GET
	@Path("ping")
	@Produces(MediaType.TEXT_PLAIN) // Application_Json
	public String getIt() {
		return "1";
	}

	@GET
	@Path("neuesspiel")
	@Produces(MediaType.TEXT_PLAIN) // Application_Json
	public String neuesSpiel() {

		s = new Spiel();

		return "neues spiel erstellt";
	}

	@GET
	@Path("neuesunternehmen/{name}")
	@Produces(MediaType.TEXT_PLAIN) // Application_Json
	public String neuesSpiel(@PathParam("name") String name) {

		if (s != null) {

			s.unternehmenHinzufuegen(new Unternehmen(name));
		}

		return "neues unternehmen mit name " + name;
	}

	@GET
	@Path("spielstarten")
	@Produces(MediaType.TEXT_PLAIN)
	public String spielStart() {
		//
		s.rundenStart();

		return "spiel start";
	}
	
	@GET
	@Path("quickstart")
	@Produces(MediaType.TEXT_PLAIN)
	public String qs() {
		s = new Spiel();
		if (s != null) {

			s.unternehmenHinzufuegen(new Unternehmen("ui"));
			s.unternehmenHinzufuegen(new Unternehmen("uii"));
		}

		s.rundenStart();
		return "spiel start";
	}

	@GET
	@Path("zugbeendet")
	@Produces(MediaType.TEXT_PLAIN)
	public String zugBeendet() {
		//
		return s.zugBeendet();

	}

	@GET
	@Path("stats")
	@Produces(MediaType.TEXT_PLAIN)
	public String gameStats() {
		//
		return s.gameStatsHelper();

	}

	@GET
	@Path("bmarkt")
	@Produces(MediaType.APPLICATION_JSON)
	public Beschaffungsmarkt getBMarkt() {
		//
		return s.getNaechstesUnternehmen().getBmarkt();

	}

	@GET
	@Path("vmarkt")
	@Produces(MediaType.APPLICATION_JSON)
	public Verkaufsmarkt getVMarkt() {
		//
		return s.getNaechstesUnternehmen().getVmarkt();

	}

	@GET
	@Path("mmarkt")
	@Produces(MediaType.APPLICATION_JSON)
	public Maschinenmarkt getMMarkt() {
		//
		return s.getNaechstesUnternehmen().getMmarkt();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("setangebote")
	@Produces(MediaType.APPLICATION_JSON)
	public void setAngebote(String json) {
		List<Angebot> angebote = new Gson().fromJson(json, new TypeToken<List<Angebot>>() {
		}.getType());
		//
		s.getNaechstesUnternehmen().getVmarkt().setAngebote(angebote);

	}

	@GET
	@Path("angebotkaufen/{menge}/{angebotsid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Object kaufeAngebot(@PathParam("menge") int menge, @PathParam("angebotsid") int id) {
		// erstmal bezahlen
		
		Angebot angebot = Angebot.findeAngebot(id);
		if(angebot == null)
			return "kein anbgebot mit der id";
		//new Gson().fromJson(json, Angebot.class);  convert json to java object
		
		if (angebot.getMenge() < menge)
			menge = angebot.getMenge(); // maximal was angeboten wird

		if (angebot.getMarkteinheit() instanceof Maschine) {
			s.getNaechstesUnternehmen().getMmarkt().kaufen(angebot, menge, s.getNaechstesUnternehmen());

		} else if (angebot.getMarkteinheit() instanceof Material) {

			s.getNaechstesUnternehmen().getBmarkt().kaufen(angebot, menge, s.getNaechstesUnternehmen());
		} else {
			// sollte nicht passieren
		}

		return "gekauft " + menge + " vomn " + angebot.getMarkteinheit().getClass().getName();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("demopost")
	@Produces(MediaType.APPLICATION_JSON)
	public Object kaufeAngebot(String json) {

		return "toll";

	}
	@GET
	@Path("bestand")
	@Produces(MediaType.APPLICATION_JSON)
	public Object getBestand() {
		//
		Map<String, Integer> bestand = new HashMap<String, Integer>();
		bestand.putAll(s.getNaechstesUnternehmen().getMaschinen());
		bestand.putAll(s.getNaechstesUnternehmen().getMaterialien());
		bestand.putAll(s.getNaechstesUnternehmen().getProdukte());
		return bestand;

	}
	
	@GET
	@Path("produziere/{menge}/{produktid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Object produziere(@PathParam("menge") int menge, @PathParam("produktid") int id) {
		// erstmal bezahlen
		return null;

	}
	
}