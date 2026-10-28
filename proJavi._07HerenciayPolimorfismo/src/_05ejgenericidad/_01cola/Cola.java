package _05ejgenericidad._01cola;

import java.util.ArrayList;

public class Cola <T> {
	
	private ArrayList<T> elementos;
	
	public Cola(){
		elementos = new ArrayList<>();
	}

	public void encolar(T elemento){
		//Anyado el elemento al final del arrayList
		elementos.add(elemento);
	}

	public void desencolar(){
		//Se elimina el primer elemento
		elementos.remove(0);
	}
	
	public T primero(){
		return elementos.get(0);
	}
	
	public int talla(){
		return elementos.size();
	}
	
	public String toString(){
		String res = "";
		for(T e: elementos){
			res = res + e + "\n";
			//res += e + "\n";
		}
		return res;
	}
}
