package _02ejemplos._04trayectos;

import _02ejemplos._01tiempo.Tiempo;

/**
 * Representa un trayecto en autobus entre dos puntos
 * 
 *
 */
public class TrayectoBus implements Comparable<TrayectoBus> {
	// Atributos
	private String nombre;
	private String origen; // punto de origen
	private String destino; // punto de destino
	private Tiempo salida; // hora de salida
	private Tiempo llegada; // hora de llegada

	// Constructor
	public TrayectoBus(String nombre, String origen, String destino, Tiempo salida, Tiempo llegada) {

		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.llegada = llegada;

	}

	// toString
	public String toString() {
		// return "Nombre: " + nombre +
		// "\nOrigen: " + origen +
		// "\nDestino: " + destino +
		// "\nHora salida: " + salida +
		// "\nHora llegad: " + llegada;
		return String.format("%s: %s(%s) - %s(%s)", nombre, origen, salida, destino, llegada);

	}

	// Getters
	public String getNombre() {
		return this.nombre;
	}

	public String getOrigen() {
		return this.origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public Tiempo getSalida() {
		return this.salida;
	}

	public Tiempo getLlegada() {
		return this.llegada;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}

	public void setLlegada(Tiempo llegada) {
		this.llegada = llegada;
	}

	// equals: Dos trayectos se consideran iguales
	// si tienen el mismo origen y destino y salen a la misma
	// hora
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof TrayectoBus))
			return false;
		TrayectoBus t = (TrayectoBus) o;
		if (this.origen.equals(t.origen) && this.destino.equals(t.destino) && this.salida.equals(t.salida))
			return true;
		else
			return false;
	}

	public int compareTo(TrayectoBus t) {
		// Relación de orden: Por hora de salida, a igual hora
		// de salida, por ciudad de salida, a igual hora y ciudad
		// de salida, por ciudad de llegada

		if (this.salida.compareTo(t.salida) < 0) {
			return -1;
		} else if (this.salida.compareTo(t.salida) > 0) {
			return 1;
		} else if (this.origen.compareTo(t.origen) < 0) {
			return -1;
		} else if (this.origen.compareTo(t.origen) > 0) {
			return 1;
		} else if (this.destino.compareTo(t.destino) < 0) {
			return -1;
		} else if (this.destino.compareTo(t.destino) > 0) {
			return 1;
		} else
			return 0;
	}
	public int compareTo2(TrayectoBus t){
		int comparacion1 = this.salida.compareTo(t.salida);
		if(comparacion1 != 0) return comparacion1;
		
		int comparacion2 = this.origen.compareTo(t.origen);
		if(comparacion2 != 0) return comparacion2;
		
		return this.destino.compareTo(t.destino);
		
	}

}
