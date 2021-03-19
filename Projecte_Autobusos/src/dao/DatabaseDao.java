package dao;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ConstantsApi;
import model.Parada;
import model.Ruta;
import model.Usuari;

public class DatabaseDao {

	/*
	 * 
	 * Actualitzat 
	 * 
	 */
	
//**********************************************************************************************
//***************************************       RUTAS       ************************************
//**********************************************************************************************
	
	
	public ArrayList<Ruta> getRutas() {

		ArrayList<Ruta> rutas = new ArrayList<Ruta>();
		//ArrayList<Parada> paradas = new ArrayList<Parada>();

		try {
			Connection con = DriverManager.getConnection(ConstantsApi.CONNECTION, ConstantsApi.USER_CONNECTION,
					ConstantsApi.PASS_CONNECTION);

			PreparedStatement stmt = con.prepareStatement("SELECT * FROM autobusos.rutas");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Ruta ru = new Ruta(rs.getInt("id_ruta"),rs.getString("nom"),rs.getString("caracter"),
						rs.getString("recollida"),rs.getString("destinacio"),rs.getString("informacion"),
						rs.getString("guia_asignat"),rs.getString("paradas"));
				
				//com poso el json dels ous a una arraylist?  (parse???)

				rutas.add(ru);

			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println("Error en la ejecucion: " + e.getErrorCode());
		}
		return rutas;

	}
	
	
	
	
	
	//**********************************************************************************************
	//***************************************       USERS       ************************************
	//**********************************************************************************************
	
	public ArrayList<Usuari> getUsuaris() {

		ArrayList<Usuari> users = new ArrayList<Usuari>();


		try {
			Connection con = DriverManager.getConnection(ConstantsApi.CONNECTION, ConstantsApi.USER_CONNECTION,
					ConstantsApi.PASS_CONNECTION);

			PreparedStatement stmt = con.prepareStatement("SELECT * FROM autobusos.usuaris");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Usuari us = new Usuari(rs.getInt("id_usuari"),rs.getString("nom"),rs.getString("cognoms"),
						rs.getString("funcio"),rs.getString("fecha_entrada"),rs.getInt("telefon"),rs.getString("correuElectronic"),rs.getString("permisos"),rs.getString("contrasenya"));
				

				users.add(us);

			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println("Error en la ejecucion: " + e.getErrorCode());
		}
		return users;

	}





	public Boolean checkUsuari(Usuari us) {
		
		int id = us.getId_usuari();
		String pass = us.getContrasenya();
		
		ArrayList<Usuari> users = new ArrayList<Usuari>();
		
		
		//SELECT * FROM autobusos.usuaris WHERE id_usuari='-1' and contrasenya='1234'
		
		
		try {
			Connection con = DriverManager.getConnection(ConstantsApi.CONNECTION, ConstantsApi.USER_CONNECTION,
					ConstantsApi.PASS_CONNECTION);

			PreparedStatement stmt = con.prepareStatement("SELECT * FROM autobusos.usuaris WHERE id_usuari='"+id+"' and contrasenya='"+pass+"'");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				Usuari user = new Usuari(rs.getInt("id_usuari"),rs.getString("nom"),rs.getString("cognoms"),
						rs.getString("funcio"),rs.getString("fecha_entrada"),rs.getInt("telefon"),rs.getString("correuElectronic"),rs.getString("permisos"),rs.getString("contrasenya"));
				

				users.add(us);

			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println("Error en la ejecucion: " + e.getErrorCode());
		}
		if(users.size() == 1) {
			return true;  //login correcte
		}
		return false; //login incorrecte
	}
	
	
	
	
}



