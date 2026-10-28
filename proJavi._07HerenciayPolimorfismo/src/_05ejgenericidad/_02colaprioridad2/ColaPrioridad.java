package _05ejgenericidad._02colaprioridad2;

import java.util.ArrayList;

public class ColaPrioridad <T extends Priorizable> {
	
	private ArrayList<T> elementos;
	
	public ColaPrioridad(){
		elementos = new ArrayList<>();
	}
	
	//Anyade un elemento al ArrayList de forma que este se
	//mantenga ordenado de menor a mayor
	public void encolar(T e){
		boolean enc = false;
		for(int i = 0; i < elementos.size() && !enc; i++){
			if(elementos.get(i).getPrioridad() < e.getPrioridad()){
				//Hemos encontrado el primer elemento 
				// mayor que e. Insertamos e y detenemos
				// la busqueda
				elementos.add(i,e);
				enc = true;
			}
		}
		
		if(!enc){
			//Hay que anyadir al final
			elementos.add(e);
		}
	}
	
	public void desencolar(){
		elementos.remove(0);
	}
	
	public T primero(){
		return elementos.get(0);
	}
	
	public int talla(){
		return elementos.size();
	}
}
