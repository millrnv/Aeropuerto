package Aeropuerto;

import java.util.*;

public class Avion {

	Aeropuerto aeropuerto;
	Collection<Vuelo> vuelos;
	private string nombreAvion;
	private int a�o;
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

	public int getA�o() {
		return this.a�o;
	}

	/**
	 * 
	 * @param a�o
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
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