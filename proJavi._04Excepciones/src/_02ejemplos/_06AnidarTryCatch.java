package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06AnidarTryCatch {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("División entera de dos números: ");
		try {
			System.out.println("Dividendo: ");
			int a = tec.nextInt();
			try {
				System.out.println("Divisor: ");
				int b = tec.nextInt();
				if(b != 0) {
					System.out.println("Cociente: " + (a / b));
					System.out.println("Resto: " + (a % b));
				} else {
					System.out.println("No se puede dividir por 0");
				}
			} catch (InputMismatchException e) {
				System.out.println("El divisor tiene que ser entero");
			}
		} catch (InputMismatchException e) {
			System.out.println("El dividendo tiene que ser entero");
		}
		System.out.println("Fin del programa");

	}

}
