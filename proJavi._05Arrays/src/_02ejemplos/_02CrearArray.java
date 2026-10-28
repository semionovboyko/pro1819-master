package _02ejemplos;

import java.util.Arrays;

public class _02CrearArray {
	public static void main(String[] args) {
		int[] edad;
		edad = new int[5];
		
		//Los arrays numéricos se inicializan con ceros
		System.out.println("Edad 0: " + edad[0]);
		System.out.println("Edad 1: " + edad[1]);
		System.out.println("Edad 2: " + edad[2]);
		System.out.println("Edad 3: " + edad[3]);
		System.out.println("Edad 4: " + edad[4]);
		
		//No se puede imprimir un array completo sin ayuda 
		//de la clase Arrays
		System.out.println("Edad: " + edad); 
		
		//Forma correcta de imprimir un array completo
		System.out.println(Arrays.toString(edad));
		
		//Acceso a los componentes del array
		edad[0] = 10;
		edad[1] = 12;
		edad[2] = edad[0] + edad[1];
		
		System.out.println(Arrays.toString(edad));
		
		
	}
}
