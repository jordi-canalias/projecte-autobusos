package service;

import java.util.ArrayList;

import dao.DatabaseDao;
import model.Inquilino;
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
	
	
	
	// ---------------USUARIS----------------------
	
	
	public ArrayList<Usuari> getUsuarisServ() {
		return dao.getUsuaris();
	}
	
	public Boolean checkUsuariServ(Usuari us) {
		return dao.checkUsuari(us);
	}
	
	
	
	
	
}