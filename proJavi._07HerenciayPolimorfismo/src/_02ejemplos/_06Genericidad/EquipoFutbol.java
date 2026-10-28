package _02ejemplos._06Genericidad;

import java.util.ArrayList;

public class EquipoFutbol {
	private String nombre;
	private ArrayList<Futbolista> miembros;
	private Futbolista capitan;
	
	public EquipoFutbol(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}
	public void anyadir(Futbolista f){
		if(!miembros.contains(f)){
			miembros.add(f);
		}
	}
	public void despedir(Futbolista f){
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
	
	public void setCapitan(Futbolista f){
		capitan = f;
	}
}
