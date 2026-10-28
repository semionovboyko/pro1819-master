package _02ejemplos._06Genericidad;

public class Baloncestista {
	private String nombre;
	public Baloncestista(String nombre){
		this.nombre = nombre;
	}
	public String toString(){
		return nombre;
	}
	public boolean equals(Object o){
		return this == o && o instanceof Baloncestista 
				&& this.nombre.equals(((Baloncestista)o).nombre);
	}
}
