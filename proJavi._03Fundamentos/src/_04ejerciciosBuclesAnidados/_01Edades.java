package _04ejerciciosBuclesAnidados;

import java.util.Scanner;

public class _01Edades {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int sumaEdades;
		do {
			sumaEdades = 0;
			for (int cont = 0; cont < 5; cont++) {
				System.out.print("Edad " + (cont + 1) + ": ");
				int edad = tec.nextInt();

				sumaEdades += edad;
				// sumaEdades = sumaEdades + edad;
			}
			System.out.println("Suma: " + sumaEdades);
		} while (sumaEdades < 200);
	}
}
