package _02ejemplos._06Genericidad;

public class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	
	public Futbolista(String nombre){
		this.nombre = nombre;
	}
	
	public String toString(){
		return nombre;
	}
	
	public boolean equals(Object o){
		return this == o && o instanceof Futbolista 
				&& this.nombre.equals(((Futbolista)o).nombre);
	}

	@Override
	public int compareTo(Futbolista o) {
		return this.nombre.compareTo(o.nombre);
	}
}
