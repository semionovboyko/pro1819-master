package _02ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class _04TresRecorridos {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("María");
		nombres.add("Mercedes");
		nombres.add("Luisa");
		
		System.out.println(nombres.toString());
		
		//Recorrer para imprimir cada nombre en una linea
		
		//Recorrido 1: Con for y get
		for(int i = 0; i < nombres.size(); i++){
			String n = nombres.get(i);
			System.out.println(n);
			
			// O bien
			//System.out.println(nombres.get(i));
		}
		System.out.println("---------------");
		
		//Recorrido 2: Con un for-each
		for(String n: nombres) {
			System.out.println(n);
		}

		System.out.println("---------------");

		//Recorrido 3: 
		Iterator<String> it = nombres.iterator();
		while(it.hasNext()){
			String n = it.next();
			System.out.println(n);
		}
	}
	
	
	
	
	
	
	

}
