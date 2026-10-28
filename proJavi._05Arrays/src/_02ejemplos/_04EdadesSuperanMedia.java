package _02ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class _04EdadesSuperanMedia {
	/**
	 * Leer la edad de una serie de personas y 
	 * mostrar cuántas personas superan la media 
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		final int NUMPERSONAS = 3;

		//Creamos array para guardar las edades
		int[] edad = new int[NUMPERSONAS];
		/*
		System.out.println("Edad 1: ");
		edad[0] = tec.nextInt();
		System.out.println("Edad 2: ");
		edad[1] = tec.nextInt();
		System.out.println("Edad 3: ");
		edad[2] = tec.nextInt();
		System.out.println("Edad 4: ");
		edad[3] = tec.nextInt();
		System.out.println("Edad 5: ");
		edad[4] = tec.nextInt();
		*/
		
		int edadTotal = 0;
		for(int i = 0; i < NUMPERSONAS; i++){
			System.out.println("Edad " + (i + 1) + ": ");
			edad[i] = tec.nextInt();
			edadTotal = edadTotal + edad[i];
		}
		System.out.println(Arrays.toString(edad));

		double media = (double) edadTotal / NUMPERSONAS;
		System.out.println("Edad media: " + media);
		
		//cuantas personas superan la media?
		//RECORREMOS el array para contar cuantos elementos 
		//son mayores que la variable media.
		int mayores = 0;
		for(int i = 0; i < NUMPERSONAS; i++){
			if(edad[i] > media){
				mayores++;
			}
		}
		System.out.println("Superan la media: " + mayores);
		
	}
}
