package _02ejemplos._06Genericidad;

import java.util.ArrayList;

public class EquipoBaloncesto {
	private String nombre;
	private ArrayList<Baloncestista> miembros;
	private Baloncestista capitan;
	
	public EquipoBaloncesto(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}
	public void anyadir(Baloncestista f){
		if(!miembros.contains(f)){
			miembros.add(f);
		}
	}
	public void despedir(Baloncestista f){
		if(capitan.equals(f)){
			capitan = null;
		}
		miembros.remove(f);
	}
	public String toString(){
		return "Equipo: " + nombre + "\n" + 
				"Capitan: " + capitan + "\n" +
				"Miembros: " + miembros;
	}
	
	public void setCapitan(Baloncestista f){
		capitan = f;
	}
}
