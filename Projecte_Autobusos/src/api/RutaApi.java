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
	
	/*
	 * GET rutaById ==> {"/id"}
		GET rutasByUsuari (chofer, guia o oficinista)  ==> {"/usuari"}
		GET rutasByDia  ==> {"/date"}
		GET rutasByBus ==> {"/bus"}
		GET rutasByClient ==> {"/client"}
		GET rutasByLLoc  ==> {"/lloc"}
		PUT insertaRuta ==> {"/"}
		POST actualitzaRuta ==> {"/"}
		DELETE borraRuta ==> {"/"}
	 */
	
	
	@GET
	@Path("/")
	public Response getRutas() {
		return Response.ok(service.getRutasServ(), MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("{id}")
	public Response getRutaById(@PathParam("id") int id) {
		return Response.ok(service.getRutaByIdServ(id), MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("{user}")
	public Response getRutaByUsuari(@PathParam("user") int user) {
		return Response.ok(service.getRutaByUserServ(user), MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("{date}")
	public Response getRutaByDia(@PathParam("date") String date) {
		return Response.ok(service.getRutaByDateServ(date), MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("{bus}")
	public Response getRutaByBus(@PathParam("bus") String bus) {
		return Response.ok(service.getRutaByBusServ(bus), MediaType.APPLICATION_JSON).build();
	}
	
	
	@GET
	@Path("{client}")
	public Response getRutaByClient(@PathParam("client") String client) {
		return Response.ok(service.getRutaByClienteServ(client), MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("{lloc}")
	public Response getRutaByLloc(@PathParam("client") String client) {
		return Response.ok(service.getRutaByClienteServ(client), MediaType.APPLICATION_JSON).build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
