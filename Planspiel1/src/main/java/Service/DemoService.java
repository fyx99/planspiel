package Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Fachkonzept.Beschaffungsmarkt;
import Fachkonzept.ProduktSet;
import Fachkonzept.Spiel;
import Fachkonzept.Unternehmen;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("demo")
public class DemoService {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	private static Spiel s;
	private static ProduktSet ps;
	
    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String getIt() {
        return "1";
    }
    
    @GET
    @Path("neuesspiel")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String neuesSpiel() {
    	
    	s = new Spiel();
    	
    	
        return "neues spiel erstellt";
    }
    
    @GET
    @Path("neuesunternehmen/{name}")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String neuesSpiel(@PathParam("name") String name) {
    	
    	if(s != null) {
    		
    		s.unternehmenHinzufuegen(new Unternehmen(name));
    	}
    	
    	
        return "neues unternehmen mit name " + name;
    }
    
    @GET
    @Path("spielstarten")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String spielStart() {
    	//
    	s.rundenStart();
    	
    	return "spiel start";
    }
    
    @GET
    @Path("zugbeendet")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String zugBeendet() {
    	//
    	return s.zugBeendet();
    
    }
    
    @GET
    @Path("stats")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String gameStats() {
    	//
    	return s.gameStatsHelper();
    
    }

    
    @GET
    @Path("bmarkt")
    @Produces(MediaType.APPLICATION_JSON)			//Application_Json
    public Beschaffungsmarkt getBMarkt() {
    	//
    	return s.getNaechstesUnternehmen().getBmarkt();
    
    }
}
