package _03ejercicios;

import java.util.Scanner;

public class _07Palabras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce texto: ");
		String texto = tec.nextLine();
		
		System.out.println("Primera letra: " + texto.charAt(0));
		System.out.println("Primera letra: " + texto.charAt(texto.length()-1));
		
		int blanco1 = texto.indexOf(' ');
		int blanco2 = texto.indexOf(' ', blanco1 + 1); 
		String palabra1, palabra2,palabra3;
		
		if(blanco1 == -1) {
			System.out.println("Primera palabra: " + texto);
		} else {
			//Hay al menos dos palabras
			palabra1 = texto.substring(0,blanco1);
			System.out.println("Primera palabra: " + palabra1);
			
			if(blanco2 == -1) {
				palabra2 = texto.substring(blanco1 + 1);
				System.out.println("Segunda palabra: " + palabra2);
			} else {
				//Hay 3 palabras
				palabra2 = texto.substring(blanco1 + 1, blanco2);
				System.out.println("Segunda palabra: " + palabra2);
				palabra3 = texto.substring(blanco2 + 1);
				System.out.println("Tercera palabra: " + palabra3);
			}
		}	
	}
}
