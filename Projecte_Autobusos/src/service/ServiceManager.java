package service;

import java.util.ArrayList;

import dao.DatabaseDao;
import model.Ruta;


public class ServiceManager {
	private DatabaseDao dao;

	public ServiceManager() {
		this.dao = new DatabaseDao();
	}

	// ---------------BARRIO----------------------
	
	
	public ArrayList<Ruta> getRutasServ() {
		return dao.getRutas();
	}
	
	
	
}