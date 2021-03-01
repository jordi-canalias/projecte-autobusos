package model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Linia {

	@JsonProperty("id_linia")
	private int id_linia;
	@JsonProperty("nom")
	private String nom;
	@JsonProperty("informacion")
	private String informacion;
	@JsonProperty("bus_asignat")
	private String bus_asignat;
	@JsonProperty("hora_inici")
	private String hora_inici;
	@JsonProperty("hora_finalitzacio")
	private String hora_finalitzacio;
	@JsonProperty("recorregut")
	private ArrayList<Parada> recorregut;

	
	@JsonCreator
	public Linia(
			@JsonProperty("id_linia") final int id_linia,
			@JsonProperty("nom") final String nom,
			@JsonProperty("informacion") final String informacion,
			@JsonProperty("bus_asignat") final String bus_asignat,
			@JsonProperty("hora_inici") final String hora_inici,
			@JsonProperty("hora_finalitzacio") final String hora_finalitzacio,
			@JsonProperty("recorregut") final ArrayList<Parada> recorregut) {
		this.id_linia = id_linia;
		this.nom = nom;
		this.informacion = informacion;
		this.bus_asignat = bus_asignat;
		this.hora_inici = hora_inici;
		this.hora_finalitzacio = hora_finalitzacio;
		this.recorregut = recorregut;
	}
	
	@JsonProperty("id_linia")
	public int getId_linia() {
		return id_linia;
	}
	
	@JsonProperty("nom")
	public String getNom() {
		return nom;
	}
	
	@JsonProperty("informacion")
	public String getInformacion() {
		return informacion;
	}
	
	@JsonProperty("buus_asignat")
	public String getBus_asignat() {
		return bus_asignat;
	}
	
	@JsonProperty("horra_inci")
	public String getHora_inici() {
		return hora_inici;
	}
	
	@JsonProperty("hora_finalitzacio")
	public String getHora_finalitzacio() {
		return hora_finalitzacio;
	}
	
	@JsonProperty("recorregut")
	public ArrayList<Parada> getRecorregut() {
		return recorregut;
	}
	
	//TODO: Complementar el código del constructor
	
	
	
	
}
