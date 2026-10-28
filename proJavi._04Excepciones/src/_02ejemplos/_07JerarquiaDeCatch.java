package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _07JerarquiaDeCatch {
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

		} catch (InputMismatchException e) {
			System.out.println("Los datos tienen que ser enteros");
		} catch (Exception e) {
			//La división por cero ejecutará este catch			
			System.out.println("Se ha producido algun error");
		}
	}
}
