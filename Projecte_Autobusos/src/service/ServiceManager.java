package service;

import java.util.ArrayList;

import dao.DatabaseDao;
import model.Linia;
import model.Ruta;
import model.Usuari;


public class ServiceManager {
	private DatabaseDao dao;

	public ServiceManager() {
		this.dao = new DatabaseDao();
	}

	// ---------------RUTAS----------------------
	
	
	public ArrayList<Ruta> getRutasServ() {
		return dao.getRutas();
	}
	
	public Ruta getRutaByIdServ(int id) {
		return dao.getRutaById(id);
	}
	
	
	public ArrayList<Ruta> getRutasByGuiaServ(String guia) {
		return dao.getRutasByGuia(guia);
	}
	
	public ArrayList<Ruta> getRutasByClientServ(String client) {
		return dao.getRutasByClient(client);
	}
	
	public ArrayList<Ruta> getRutasByLlocServ(String lloc) {
		return dao.getRutasByLloc(lloc);
	}
	
	public String setRutaServ(Ruta ruta) {
		 dao.setRutas(ruta);
		 
		 //logica de comprobacion xd
		 
		 return "Ruta insertada";
	}
	
	public String deleteRutaServ(int id) {
		 dao.deleteRuta(id);
		 
		 //logica de comprobacion xd
		 
		 return "Ruta eliminada";
	}
	
	// ---------------LINIAS----------------------
	
	
		public ArrayList<Linia> getLiniasServ() {
			return dao.getLinias();
		}
	
		
		public Linia getLiniaByIdServ(int id) {
			return dao.getLiniaById(id);
		}
		
		public Linia getLiniaByNomServ(String nom) {
			return dao.getLiniaByNom(nom);
		}
		
		public Linia getLiniaByBusServ(String bus) {
			return dao.getLiniaByBus(bus);
		}
		
		public String setLiniaServ(Linia linia) {
			 dao.setLinia(linia);
			 
			 //logica de comprobacion xd
			 
			 return "Linia insertada";
		}
		
	
	
		
		
	
	
	// ---------------USUARIS----------------------
	
	
	public ArrayList<Usuari> getUsuarisServ() {
		return dao.getUsuaris();
	}
	
	public Boolean checkUsuariServ(Usuari us) {
		return dao.checkUsuari(us);
	}
	
	
	
	
	
}