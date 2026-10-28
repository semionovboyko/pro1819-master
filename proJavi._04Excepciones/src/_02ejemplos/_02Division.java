package _02ejemplos;

import java.util.Scanner;

public class _02Division {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("División entera de dos números: ");
		System.out.println("Dividendo: ");
		int a = tec.nextInt();
		System.out.println("Divisor: ");
		int b = tec.nextInt();

		//EVITAR LA EXCEPCIÓN
		if (b != 0) {
			System.out.println("Cociente: " + (a / b));
			System.out.println("Resto: " + (a % b));
		} else {
			System.out.println("No se puede dividir por cero");
		}
	}

}
