package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _09Recuperarse3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("División entera de dos números: ");
		int a = leerEntero("Introduce dividendo: ");
		int b = leerEntero("Introduce divisor: ");
					
		//EVITAR LA EXCEPCIÓN
		if (b != 0) {
			System.out.println("Cociente: " + (a / b));
			System.out.println("Resto: " + (a % b));
		} else {
			System.out.println("No se puede dividir por cero");
		}
	}
	public static int leerEntero(String texto){
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		int num = 0;
		while(!ok){
			try {
				System.out.println(texto);
				num = tec.nextInt();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Debe ser un entero");
				tec.nextLine();
			}
		}
		return num;
		
	}

}
