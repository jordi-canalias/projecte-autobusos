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

import model.Inquilino;
import model.Usuari;
import service.ServiceManager;

@Path("/usuaris")
@Produces("application/json;charset=UTF-8")
@Consumes("application/json;charset=UTF-8")

public class UsuariApi {
	
	private ServiceManager service;
	
	public UsuariApi() {
		service=new ServiceManager();
	}
	
	  
	//test-----------
	
	/*
	 * GET totsUsuaris ==> {"/"}
	GET usuariById ==> {"/id"}
	GET usuarisByFuncio ==> {"/funcio"}
	GET getUsuariosOrdenEntrada ==> {"/"}
	PUT checkUsuari ==> {"/login"}
	PUT setUsuario ==> {"/"}
	POST updateUsuario ==> {"/id"}
	DELETE borraUsuario ==> {"/id"}
	 */
	
	
	@GET
	@Path("/")
	public Response getUsuaris() {
		return Response.ok(service.getUsuarisServ(), MediaType.APPLICATION_JSON).build();
	}
	
	
	@PUT
	@Path("/login")
	public Response putInquilino(Usuari us) {
		
		Boolean res = service.checkUsuariServ(us);
		System.out.print(res);
		
		return Response.ok(res ,MediaType.APPLICATION_JSON).build();
	}
	
	
	
	
	
	@GET
	@Path("{id}")
	public Response getUsuariById(@PathParam("id") int id) {
		return Response.ok(service.getUsuariByIdServ(id), MediaType.APPLICATION_JSON).build();
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