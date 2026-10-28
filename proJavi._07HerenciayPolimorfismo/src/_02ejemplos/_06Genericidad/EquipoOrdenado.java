package _02ejemplos._06Genericidad;

import java.util.ArrayList;
//Es una clase generica como la clase Equipo
//pero en la que los miembros del equipo siempre 
//aparecen ordenados

public class EquipoOrdenado <T extends Comparable<T>> {
	private String nombre;
	private ArrayList<T> miembros;
	private T capitan;
	
	public EquipoOrdenado(String nombre){
		this.nombre = nombre;
		miembros = new ArrayList<>();
	}
	public void anyadir(T f){
		if(!miembros.contains(f)){
			//insertamos en la posición que le corresponda para 
			//que la lista esté ordenada.
			//Busca el primero que sea mayor o igual que f
			boolean enc = false;
			for(int i = 0; i< miembros.size() && !enc; i++){
				if(miembros.get(i).compareTo(f) >=0 ){
					miembros.add(i,f);
					enc = true;
				}
			}
			//Si no ha encontrado ninguno mayor o igual, anyade al final
			if(!enc){
				miembros.add(f);
			}
			
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
}
