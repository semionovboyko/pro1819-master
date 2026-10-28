package _03ejercicios._03contrarreloj;

import _02ejemplos._01tiempo.Tiempo;

public class Corredor implements Comparable<Corredor> {
	private static int siguienteDorsal = 1;
	private int dorsal;
	private String nombre;
	private Tiempo salida;
	private Tiempo llegada;

	public Corredor(int d, String n, Tiempo s) {
		this.dorsal = d;
		this.nombre = n;
		this.salida = s;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public Tiempo getSalida() {
		return salida;
	}

	public Tiempo getLlegada() {
		return llegada;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}

	public void setLlegada(Tiempo llegada) throws IllegalArgumentException{
		if (llegada != null) {
			if (this.salida.compareTo(llegada) >= 0) {
				throw new IllegalArgumentException("Tiene que ser posterior a la salida");
			}
		}
		this.llegada = llegada;
	}

	public int getDuracion(){
		if(this.llegada == null){
			throw new UnsupportedOperationException("No ha llegado");
		}
		return this.llegada.pasarASegundos() - this.salida.pasarASegundos();
	}
	public String toString(){
		if(llegada == null){
			return String.format("(%d) - %s - Salida: %s", dorsal,
					nombre, salida);
		} else {
			return String.format("(%d) - %s - Salida: %s "
					+ "- Llegada: %s - Duracion: %d", dorsal,
					nombre, salida,llegada,getDuracion());
			
		}
	}
	public boolean equals(Object o){
		if(this == o) return true;
		if (!(o instanceof Corredor)) return false;
		Corredor c = (Corredor) o;
		
		if(this.dorsal == c.dorsal) return true;
		else return false;
		//return this.dorsal == c.dorsal;
	}

	public int compareTo(Corredor c) {
		return this.dorsal - c.dorsal;
//		if(this.dorsal < c.dorsal) return -1;
//		else if(this.dorsal > c.dorsal) return 1;
//		else return 0;
	}
	public static int generarDorsal(){
		int valor = siguienteDorsal;
		siguienteDorsal ++;
		return valor;
	}
	public static int generarDorsalV2(){
		siguienteDorsal++;
		return siguienteDorsal - 1;
	}
	public static int generarDorsalV3(){
		return siguienteDorsal++;
		
	}
	
}









