package _02ejemplos;

import java.util.Scanner;

public class _23MetodoVoid {
	
	static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Mostrar por pantalla 10 números aleatorios
		int cont = 0;
		while  (cont < 10) {
			double num = Math.random();
			
			mostrarYEsperar("Numero: " + num);
			cont++;
		}
	}
	
	public static void mostrarYEsperar(String mensaje){
		System.out.println(mensaje);
		System.out.println();
		System.out.println("Pulse INTRO para continuar ...");
		tec.nextLine();
	}
}
