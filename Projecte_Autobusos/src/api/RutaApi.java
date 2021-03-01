package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import service.ServiceManager;

@Path("/rutas")
@Produces("application/json;charset=UTF-8")
@Consumes("application/json;charset=UTF-8")
public class RutaApi {
	
	private ServiceManager service;
	
	public RutaApi() {
		service=new ServiceManager();
	}
	
	
	//test-----------
	@GET
	@Path("/root")
	public Response sayHello2() {
		return Response.ok("Hello World desde el root REST", MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("/")
	public Response getRutas() {
		return Response.ok(service.getRutasServ(), MediaType.APPLICATION_JSON).build();
	}
	
	

}
