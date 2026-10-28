package _02ejemplos;

import java.util.Scanner;

public class _15Leer5Positivos {
	public static void main(String[] args) {
		// Leer de teclado 5 numeros positivos
		// Si el usuario introduce un valor menor o igual a cero
		// no se tiene en cuenta
		
		Scanner tec = new Scanner(System.in);
		
		int positivos = 0;
		while (positivos < 5) {
			System.out.println("Introduce número: ");
			int numero = tec.nextInt();
			
			//Hacer algo con el numero introducido
			if(numero <= 0) {
				System.out.println("Es negativo");
			} else {
				System.out.println("Es positivo");
				positivos = positivos + 1;
			}
		}
	}

}
