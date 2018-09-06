package xy.Planspiel1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Fachkonzept.Spiel;

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
	
    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String getIt() {
        return "1";
    }
    
    @GET
    @Path("roundnumber")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String getRN() {

        return "" + s.getRound();
    }
    
    @GET
    @Path("newround")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String getNR() {
    	if(s == null) {
    		s = new Spiel();
    	}
    	s.newRound();
        return "" + s.getRound();
    }
    
    @GET
    @Path("newround2")
    @Produces(MediaType.TEXT_PLAIN)			//Application_Json
    public String getNR2() {
    	if(s == null) {
    		s = new Spiel();
    	}
    	s.newRound(2);
        return "" + s.getRound();
    }
}
