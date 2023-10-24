package Aeropuerto;

import java.util.*;

public class Avion {

	Aeropuerto aeropuerto;
	Collection<Vuelo> vuelos;
	private string nombreAvion;
	private int año;
	private double kmRecorridos;

	public string getNombreAvion() {
		return this.nombreAvion;
	}

	/**
	 * 
	 * @param nombreAvion
	 */
	public void setNombreAvion(string nombreAvion) {
		this.nombreAvion = nombreAvion;
	}

	public int getAño() {
		return this.año;
	}

	/**
	 * 
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	/**
	 * 
	 * @param kmRecorridos
	 */
	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

}