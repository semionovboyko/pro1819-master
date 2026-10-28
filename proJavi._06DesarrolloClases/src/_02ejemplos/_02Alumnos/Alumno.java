package _02ejemplos._02Alumnos;

public class Alumno implements Comparable<Alumno> {
	//Atributos privados
	private int nia;
	private String nombre;
	private String grupo;
	
	//Constructor
	public Alumno (int nia, String nombre, String grupo){
		this.nia = nia;
		this.nombre = nombre;
		this.grupo = grupo;
	}


	//toString
	public String toString(){
		return nia + " - " + nombre + " - " + grupo;
	}
	
	//Getter y setter
	public int getNia(){
		return this.nia;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getGrupo(){
		return this.grupo;
	}
	
	public void setNia(int nia){
		this.nia = nia;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setGrupo(String grupo){
		this.grupo = grupo;
	}
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Alumno)) return false;
		return this.nia == ((Alumno)o).nia;
//		if(this.nia == ((Alumno)o).nia) {
//			return true; 
//		} else {
//			return false;
//		}
	}
	
	public int compareTo(Alumno a){
		if(this.nia < a.nia) return -1;
		else if(this.nia > a.nia) return 1;
		else return 0;
		//o también
		//return this.nia - a.nia;
	}






}
