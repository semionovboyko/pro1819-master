package _02ejemplos;

import java.util.ArrayList;

public class _01OperacionesBasicas {
	public static void main(String[] args) {
		//Creamos una lista de Strings
		ArrayList<String> nombres = new ArrayList<>();
		
		//Mostrar un ArrayList por pantalla
		System.out.println(nombres.toString());
		
		//Añadir elementos al final
		nombres.add("Miguel");
		nombres.add("Luis");
		nombres.add("Pablo");
		System.out.println(nombres.toString());
		
		//La lista crece a medida que añadimos elementos
		nombres.add("María");
		System.out.println(nombres.toString());
		
		//Se puede insertar elementos en una posición
		nombres.add(0,"Antonio");
		System.out.println(nombres.toString());
		
		//Si la posición es incorrecta -> Excepción
		//nombres.add(10, "Camilo");
		
		//Se puede eliminar elementos por posición
		nombres.remove(2);
		System.out.println(nombres.toString());
		
		//Se puede eliminar elementos por contenido
		System.out.println(nombres.remove("Pablo"));
		System.out.println(nombres.toString());
		System.out.println(nombres.remove("Pablito"));
		System.out.println(nombres.toString());
	}
}
