package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _01CincoNombresDistintos {
	/*
	 * Escribir un programa que permita al usuario escribir cinco nombres que
	 * tienen que ser distintos. El programa pedirá de forma repetida un nombre
	 * al usuario y no finalizará hasta que éste consiga introducir 5 distintos.
	 * 
	 * Resolver almacenando los nombres en un ArrayList<String>
	 */
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		ArrayList<String> nombres = new ArrayList<>();
		while (nombres.size() < 5) {
			System.out.println("Introduce nombre: ");
			String nombre = tec.nextLine().toUpperCase();
			
			//if(nombres.indexOf(nombre) != -1){
			if (nombres.contains(nombre)) {
				System.out.println("Repetido");
			} else {
				nombres.add(nombre);
			}
		}
		System.out.println(nombres);
		
		
		//Solución con arrays
		String[] aNombres = new String[5];
		int correctos = 0;
		while(correctos < 5){
			System.out.println("Introduce nombre: ");
			String nombre = tec.nextLine().toUpperCase();
			
			//Busco nombre dentro del array
			boolean enc = false;
			int i = 0;
			while (i < correctos && !enc){
				if(aNombres[i].equals(nombre)){
					enc = true;
				} else {
					i++;
				}
			}
			if(enc) {
				System.out.println("Repetido");
			} else {
				aNombres[correctos] = nombre;
				correctos++;
			}
		}
		System.out.println(Arrays.toString(aNombres));
		
	}
	
	
}
