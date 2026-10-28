package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01EdadesC {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		while (!ok) {
			try {
				int suma = 0;
				ok = true;
				for (int cont = 0; cont < 5 && ok; cont++) {
					System.out.println("Edad " + (cont + 1) + ": ");
					int edad = tec.nextInt();
					if (edad >= 0 && edad <= 120) {
						suma = suma + edad;
					} else {
						ok = false;
					}
				}
				if (ok) {
					System.out.println("Media: " + (suma / 5.0));
				}
			} catch (InputMismatchException e) {
				System.out.println("Error. Vuelve a empezar");
				tec.nextLine();
				ok = false;
			}
		}
	}

}
