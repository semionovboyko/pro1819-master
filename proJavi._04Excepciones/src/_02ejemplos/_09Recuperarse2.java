package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _09Recuperarse2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("División entera de dos números: ");
		int a = 0, b = 0;
		
		boolean ok = false;
		while(!ok){
			try {
				System.out.println("Dividendo: ");
				a = tec.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ser un entero");
				tec.nextLine();
			}
		}
		ok = false;
		while(!ok){
			try {
				System.out.println("Divisor: ");
				b = tec.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ser un entero");
				tec.nextLine();
			}
		}

				//EVITAR LA EXCEPCIÓN
		if (b != 0) {
			System.out.println("Cociente: " + (a / b));
			System.out.println("Resto: " + (a % b));
		} else {
			System.out.println("No se puede dividir por cero");
		}
	}

}
