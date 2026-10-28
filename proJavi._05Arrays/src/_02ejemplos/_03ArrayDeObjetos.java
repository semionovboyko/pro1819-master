package _02ejemplos;

import java.util.Arrays;

public class _03ArrayDeObjetos {
	public static void main(String[] args) {
		//Puedo crear arrays de cualquier cosa: de 
		// tipos primitivos y también de objetos
		
		String[] nombres = new String[5];
		
		//Los arrays de objetos, se inicializan con null
		System.out.println(Arrays.toString(nombres));
		
		//Asignamos valores a las componentes
		nombres[0] = "Miguel";
		nombres[1] = "Pepe";
		nombres[2] = "Antonio";
		System.out.println(Arrays.toString(nombres));
		
		//Cada componente del array es un String y lo
		//puedo utilizar como tal
		System.out.println(nombres[0].toUpperCase()); //a mayúsc.
		System.out.println(nombres[1].charAt(0)); //inicial del nombre
	}

}
