package _02ejemplos;

import java.util.ArrayList;

public class _02Busquedas {
	public static void main(String[] args) {
		ArrayList<String> asig = new ArrayList<>();
		
		asig.add("PRO");
		asig.add("FOL");
		asig.add("BDA");
		asig.add("ED");
		asig.add("LMI");
		
		//Averiguar la posición de un elemento dentro de la lista
		System.out.println(asig.indexOf("BDA"));
		System.out.println(asig.indexOf("DI"));

		//Averiguar si un elemento está o no
		System.out.println(asig.contains("BDA"));
		System.out.println(asig.contains("DI"));
		
	}
}
