package _03ejercicios;

import java.util.Scanner;

public class _13Taxi {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("DIA o NOCHE?: ");
		String dn = tec.next().toUpperCase();

		System.out.println("Día de la semana (1-7): ");
		int dia = tec.nextInt();

		System.out.println("Quilómetros: ");
		double km = tec.nextDouble();
		double coste;

		if (dn.equals("DIA")) { // Por el día
			if (dia < 7) { // Laborables
				coste = 0.73 * km;
			} else { // Domingos
				coste = 0.93 * km;
			}
//			if (coste < 2.95) {
//				coste = 2.95;
//			}
			coste = Math.max(coste, 2.95);

		} else { // Por la noche
			if (dia < 7) {
				coste = 0.84 * km;
			} else {
				coste = 0.93 * km;
			}
//			if (coste < 4) {
//				coste = 4;
//			}
			coste = Math.max(coste, 4);
		}
		System.out.println("Coste: " + coste + " euros");
	}
}
