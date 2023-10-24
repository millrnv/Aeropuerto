package Aeropuerto;

import java.util.*;

public class Vuelo extends Aeropuerto {

	Avion avion;
	Collection<Piloto> pilotos;
	Collection<Pasajero> pasajeros;
	private date horaVuelo;
	private date fechaVuelo;
	protected List<Pasajero> listaPasajeros;

	public date getHoraVuelo() {
		return this.horaVuelo;
	}

	/**
	 * 
	 * @param horaVuelo
	 */
	public void setHoraVuelo(date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}

	public date getFechaVuelo() {
		return this.fechaVuelo;
	}

	/**
	 * 
	 * @param fechaVuelo
	 */
	public void setFechaVuelo(date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	/**
	 * 
	 * @param listaPasajeros
	 */
	public void setListaPasajeros(List<Pasajero> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

}