package _02ejemplos._06Genericidad;

import java.util.ArrayList;

//Un equipo que solo pueda ser de números
public class EquipoDeNumeros <T extends Number> {
	private String nombre;
	private ArrayList<T> miembros;
	private T capitan;
	
	public EquipoDeNumeros(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}
	public void anyadir(T f){
		if(!miembros.contains(f)){
			miembros.add(f);
		}
	}
	public void despedir(T f){
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
	
	public void setCapitan(T f){
		capitan = f;
	}
	public double sumar(){
		double s = 0;
		for(T miembro: miembros){
			s = s + miembro.doubleValue();
		}
		return s;
	}
	
}
