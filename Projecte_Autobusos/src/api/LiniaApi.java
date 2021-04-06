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


import model.*;
import service.ServiceManager;

@Path("/linias")
@Produces("application/json;charset=UTF-8")
@Consumes("application/json;charset=UTF-8")
public class LiniaApi {
	
	private ServiceManager service;
	
	public LiniaApi() {
		service=new ServiceManager();
	}
	
	  
	//test-----------
	
	/*
			GET totesLinias ==> {"/"}
			GET liniaById ==> {"/id"}
			GET liniaByNom ==> {"/nom"}
			GET liniaByBus ==> {"/bus"}
			GET liniaByParada ==> {"/parada"}  
			PUT insertaLinia ==> {"/"}
			POST actualitzaLinia ==> {"/"}
			DELETE deleteLinia ==> {"/"}


	
	 */
	
	
	@GET
	@Path("/")
	public Response getLinias() {
		return Response.ok(service.getLiniasServ(), MediaType.APPLICATION_JSON).build();        //NO FUNCIONA, PERO TAMPOC DONA ERROR 
	}
	
	
	@GET
	@Path("{id}")
	public Response getLiniaById(@PathParam("id") int id) {
		return Response.ok(service.getLiniaByIdServ(id), MediaType.APPLICATION_JSON).build();
	}
	
	
	@GET
	@Path("nom/{nom}")
	public Response getLiniaByNom(@PathParam("nom") String nom) {
		return Response.ok(service.getLiniaByNomServ(nom), MediaType.APPLICATION_JSON).build();
	}
	
	@GET
	@Path("bus/{bus}")
	public Response getLiniaByBus(@PathParam("bus") String bus) {
		return Response.ok(service.getLiniaByBusServ(bus), MediaType.APPLICATION_JSON).build();
	}
	
	@PUT
	@Path("/")
	public Response putNewLinia(Linia linia) {
		
		return Response.ok(service.setLiniaServ(linia), MediaType.APPLICATION_JSON).build();
	}

	
	
	
	/*
	
	@GET
	@Path("{id}")
	public Response getRutaById(@PathParam("id") int id) {
		return Response.ok(service.getRutaByIdServ(id), MediaType.APPLICATION_JSON).build();
	}
	
	
	@GET
	@Path("guia/{guia}")
	public Response getRutaByUsuari(@PathParam("guia") String guia) {
		return Response.ok(service.getRutasByGuiaServ(guia), MediaType.APPLICATION_JSON).build();
	}

	
	@GET
	@Path("client/{client}")
	public Response getRutasByClient(@PathParam("client") String client) {
		return Response.ok(service.getRutasByClientServ(client), MediaType.APPLICATION_JSON).build();
	}
	
	
	@GET
	@Path("lloc/{lloc}")
	public Response getRutaByDia(@PathParam("lloc") String lloc) {
		return Response.ok(service.getRutasByLlocServ(lloc), MediaType.APPLICATION_JSON).build();
	}
	
	
	@PUT
	@Path("/")
	public Response putNewRuta(Ruta ruta) {
		
		return Response.ok(service.setRutaServ(ruta), MediaType.APPLICATION_JSON).build();
	}
	
	@DELETE
	@Path("/id")
	public Response deleteRuta(@PathParam("id") int id) {
		
		String res = service.deleteRutaServ(id);
		
		return Response.ok(res , MediaType.APPLICATION_JSON).build();
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
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	

}
