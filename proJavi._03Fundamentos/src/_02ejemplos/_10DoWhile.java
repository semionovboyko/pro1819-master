package _02ejemplos;

import java.util.Scanner;

public class _10DoWhile {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int edad;
		do {
			System.out.println("Edad (positiva): ");
			edad = tec.nextInt();
			if(edad <= 0){
				System.out.println("Error: tiene que ser > 0");
			}
			
		} while (edad <= 0);
		System.out.format("Tienes %d años", edad);
		
		//Lo mismo con while: Repetir instruccion antes y dentro del bucle

		System.out.println("Edad (positiva): ");
		edad = tec.nextInt();
		while(edad <= 0){
			System.out.println("Error: tiene que ser > 0");
			System.out.println("Edad (positiva): ");
			edad = tec.nextInt();
		}
		System.out.format("Tienes %d años", edad);
		
		//Lo mismo con while: Forzar a que se cumpla la condición
		
		edad = -1;
		while(edad <= 0){
			System.out.println("Edad (positiva): ");
			edad = tec.nextInt();
			if(edad <= 0) {
				System.out.println("Error: tiene que ser > 0");
			}
		}
		System.out.format("Tienes %d años", edad);
	}
}
