package _02ejemplos;

import java.util.Scanner;

public class _16ContarPositivos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int pedidos = 0;
		int positivos = 0;
		while (pedidos < 10) {
			System.out.format("Introduce número %dº:%n ", (pedidos + 1));
			int numero = tec.nextInt();
			
			//Hacer algo con el numero introducido
			if(numero > 0) {
				positivos = positivos + 1;
			} 
			
			//Incrementar el contador
			pedidos = pedidos + 1;
		}
		System.out.println("Positivos: " + positivos);
	}
}
