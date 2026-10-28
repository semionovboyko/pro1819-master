package _03ejercicios;

import java.util.Scanner;

public class _14Fuerza {
	public static void main(String[] args) {
		double m1, m2, d, f;
		Scanner tec = new Scanner(System.in);

//		System.out.println("Masa 1: ");
//		m1 = tec.nextDouble();
//
//		System.out.println("Masa 2: ");
//		m2 = tec.nextDouble();
//
//		System.out.println("Distancia: ");
//		d = tec.nextDouble();
		
		System.out.println("Introduce 2 masas y una distancia: ");
		m1 = tec.nextDouble();
		m2 = tec.nextDouble();
		d = tec.nextDouble();

		final double G = 6.693E-11;
		
		f = (G * m1 * m2) / (d*d);
		System.out.println("Fuerza: " + f);
		
	}

}
