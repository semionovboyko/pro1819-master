package _02ejemplos._02Sets;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class _04CompararBusquedas {
	public static void main(String[] args) {
		final int ELEM = 1000;
		Random r = new Random();
		long t1, t2;

		for (int elem = ELEM; elem <= 1000000000; elem *= 10) {
			// Inserciones en treeset
			TreeSet<Integer> ts = new TreeSet<>();
			t1 = System.currentTimeMillis();
			for (int i = 1; i <= elem; i++) {
				ts.add(r.nextInt());
			}
			t2 = System.currentTimeMillis();
			long tiempoTs = t2 - t1;

			// Inserciones en hashset
			HashSet<Integer> hs = new HashSet<>();
			t1 = System.currentTimeMillis();
			for (int i = 1; i <= elem; i++) {
				hs.add(r.nextInt());
			}
			t2 = System.currentTimeMillis();
			long tiempoHs = t2 - t1;

			System.out.format("Insertar %10d elementos - TS: %10d - HS: %10d%n", elem, tiempoTs, tiempoHs);
		}

	}
}
