package _03ejercicios;

import java.util.Scanner;

public class _03Calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero 1: ");
		double num1 = tec.nextDouble();
		System.out.println("Numero 2: ");
		double num2 = tec.nextDouble();

		System.out.println("Operación: ");
		String op = tec.next();

		switch (op) {
		case "+":
			System.out.format("%f + %f es %f", num1, num2, num1 + num2);
			break;
		case "-":
			System.out.format("%f - %f es %f", num1, num2, num1 - num2);
			break;
		case "*":
			System.out.format("%f * %f es %f", num1, num2, num1 * num2);
			break;
		case "/":
			System.out.format("%f / %f es %f", num1, num2, num1 / num2);
			break;
		default:
			System.out.println("OPERACIÓN NO VÁLIDA");
		}

	}
}
