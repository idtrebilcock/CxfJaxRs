package co.pablobastidasv.cxfjaxrs.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author pbastidas
 */
@Path("/egreso")
public class EgresoResource {

    @GET
    @Produces( { MediaType.APPLICATION_JSON } )
     public String get(){
        return "Hello World!!";
    }

}
