package _04ejerciciosBuclesAnidados;

import java.util.Scanner;

public class _09LetraALetra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Leer un texto mientras no se deje vacío
		String texto;
		do {
			System.out.println("Texto: ");
			texto = tec.nextLine();

			// Mostrar texto caracter a caracter
			for (int pos = 0; pos < texto.length(); pos++) {
				System.out.println(texto.charAt(pos));
			}

		} while (!texto.equals(""));

	}
}
