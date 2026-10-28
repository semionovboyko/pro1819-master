package _02ejemplos;

import java.util.Scanner;

public class _03CapturarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("División entera de dos números: ");
		System.out.println("Dividendo: ");
		int a = tec.nextInt();
		System.out.println("Divisor: ");
		int b = tec.nextInt();
		
		try{
			System.out.println("Cociente: " + (a / b));
			System.out.println("Resto: " + (a % b));
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
			System.out.println("---------- PRINT STACK TRACE ---------");
			e.printStackTrace();
		}
		System.out.println("Fin del programa");
		
	}

}
