package Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Fachkonzept.ProduktSet;
import Fachkonzept.Spiel;
import Fachkonzept.Unternehmen;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("demo")
public class MyResource {

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
    @Path("products")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String show_Products() {
    	
    	if(ps == null) {
    		ps = new ProduktSet(5);
    	}
    	
    	String s="";
    	
       for (int i = 0; i < 5; i++) {
    	   s += "ID: "+ ps.get_PS()[i].prod_id + "  Bezeichnung: " + ps.get_PS()[i].prod_name + "\n";
    	          }
       return s;
       
    }
}
