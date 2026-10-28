package _02ejemplos;

import java.util.Scanner;

public class _14Pedir10Numeros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int pedidos = 0;
		while (pedidos < 10) {
			System.out.format("Introduce número %dº:%n ", (pedidos + 1));
			int numero = tec.nextInt();
			
			//Hacer algo con el numero introducido
			if(numero < 0) {
				System.out.println("Es negativo");
			} else {
				System.out.println("Es positivo o cero");
			}
			
			//Incrementar el contador
			pedidos = pedidos + 1;
		}
	}
}
