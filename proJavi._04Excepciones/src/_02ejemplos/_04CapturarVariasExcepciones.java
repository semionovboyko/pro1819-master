package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04CapturarVariasExcepciones {
	public static void main(String[] args) {
		try {
			Scanner tec = new Scanner(System.in);
			System.out.println("División entera de dos números: ");
			System.out.println("Dividendo: ");
			int a = tec.nextInt();
			System.out.println("Divisor: ");
			int b = tec.nextInt();

			System.out.println("Cociente: " + (a / b));
			System.out.println("Resto: " + (a % b));
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
		} catch (InputMismatchException e){
			System.out.println("Los números deben ser enteros");
		}
		System.out.println("Fin del programa");

	}

}
