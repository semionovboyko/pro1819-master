package bucles;

import java.util.Scanner;

public class _01Tornillos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		final int N = 6;

		int cont = 0;
		int mp = 0, p = 0, n = 0, g = 0, mg = 0;

		double maximoMalos = N * 0.20; // Máximo nº tornillos mg o mp que puede
										// haber en la muestra.

		while (cont < N && (mp + mg <= maximoMalos)) {
			System.out.println("Diametro del tornillo " + (cont + 1) + ": ");
			double diametro = tec.nextDouble();
			if (diametro < 8)
				mp++;
			else if (diametro < 9)
				p++;
			else if (diametro < 10)
				n++;
			else if (diametro < 11)
				g++;
			else
				mg++;

			cont++;
		}

		if (mp + mg <= maximoMalos) {
			System.out.format("%-14s: %5.2f %% %n", "muy pequeños", 100.0 * mp / N);
			System.out.format("%-14s: %5.2f %% %n", "pequeños", 100.0 * p / N);
			System.out.format("%-14s: %5.2f %% %n", "normales", 100.0 * n / N);
			System.out.format("%-14s: %5.2f %% %n", "grandes", 100.0 * g / N);
			System.out.format("%-14s: %5.2f %% %n", "muy grandes", 100.0 * mg / N);
		} else {
			System.out.println("La producción se desecha");
		}
	}

}
