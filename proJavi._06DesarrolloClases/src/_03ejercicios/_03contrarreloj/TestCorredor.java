package _03ejercicios._03contrarreloj;

import _02ejemplos._01tiempo.Tiempo;

public class TestCorredor {
	public static void main(String[] args) {
		Corredor c1 = new Corredor(Corredor.generarDorsal(), "Miguel", new Tiempo(10, 0, 0));

		Corredor c2 = new Corredor(Corredor.generarDorsal(), "Pablo", new Tiempo(10, 10, 0));

		System.out.println(c1);
		System.out.println(c2);

		// Tiempo de llegada
		try {
			c1.setLlegada(new Tiempo(11, 0, 0));
			System.out.println(c1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			c2.setLlegada(new Tiempo(10, 0, 0));
			System.out.println(c2);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
