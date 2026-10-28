package _03ejercicios;

import java.util.Scanner;

public class _05Nombre {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el nombre: ");
		String nombre = tec.nextLine().toUpperCase();
		
		char primero = nombre.charAt(0);
		char ultimo = nombre.charAt(nombre.length()-1);
		
		if(primero == ultimo) {
			System.out.println("Primera y ultima iguales");
		} else {
			System.out.println("Primera y ultima distintas");
			
		}
		
		//De otra forma
		if(nombre.charAt(0) == nombre.charAt(nombre.length()-1)) {
			
			System.out.println("Primera y ultima iguales");
		} else {
			System.out.println("Primera y ultima distintas");
			
		}
		
	}
}
