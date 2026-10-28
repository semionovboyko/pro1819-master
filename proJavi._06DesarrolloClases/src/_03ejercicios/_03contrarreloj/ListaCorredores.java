package _03ejercicios._03contrarreloj;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListaCorredores {
	private ArrayList<Corredor> lista;
	
	public ListaCorredores(){
		lista = new ArrayList<>();
	}
	
	//Anyadir c a la lista si no es un duplicado
	public void anyadir(Corredor c) throws IllegalArgumentException {
		if(lista.contains(c)){
			throw new IllegalArgumentException("Corredor duplicado");
		} else {
			lista.add(c);
		}
	}
	
	//Insertar en la lista ordenada por duracion
	public void insertarOrdenado(Corredor c){
		boolean enc = false;
		for(int i = 0; i< lista.size() && !enc; i++){
			//Localizamos el primero de la lista que haya
			//tardado mas que c en llegar
			if(c.getDuracion() < lista.get(i).getDuracion()){
				lista.add(i,c);
				enc = true;
			}
		}
		//Si no hemos encontrado ninguno que haya tardado mas,
		//anyadimos al final
		if(!enc){
			lista.add(c);
		}
	}
	//Eliminar el corredor cuyo dorsal se indica
	public Corredor quitar(int dorsal){
		Corredor c = null;
		boolean enc = false;
		for(int i = 0; i< lista.size() && !enc; i++){
			//Localizamos el corredor cuyo dorsal se indica
			if(lista.get(i).getDorsal() == dorsal){
				c = lista.get(i);
				lista.remove(i);
				enc = true;
			}
		}
		if(enc){
			return c;
		} else {
			throw new NoSuchElementException("El corredor con dorsal " 
							+ dorsal + " no esta");
		}
	}
	public Corredor quitarv2(int dorsal){
		Corredor buscado = new Corredor(dorsal,"",null);
		int pos = lista.indexOf(buscado);
		if( pos == -1){
			throw new NoSuchElementException("El corredor con dorsal " 
							+ dorsal + " no esta");
		} else {
			Corredor c = lista.get(pos);
			lista.remove(pos);
			return c;
		}
	}
	public String toString(){
		String res = "";
		for(int i = 0; i < lista.size(); i++){
			res += String.format("Posicion %d: %s%n", 
					i+1, lista.get(i).toString());
		}
		return res;
	}

}
