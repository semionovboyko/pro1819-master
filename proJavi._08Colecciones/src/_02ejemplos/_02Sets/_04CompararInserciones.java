package _02ejemplos._02Sets;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class _04CompararInserciones {
	public static void main(String[] args) {
		final int ELEM = 10000000;
		final int BUSQUEDAS = 1000;
		Random r = new Random();
		long t1, t2;
		TreeSet<Integer> ts = new TreeSet<>();
		HashSet<Integer> hs = new HashSet<>();
		while (ts.size() < ELEM) {
			int num = Math.abs(r.nextInt());
			ts.add(num);
			hs.add(num);
		}

		for (int veces = BUSQUEDAS; veces <= 1000000000; veces *= 10) {
			// Busquedas en treeset
			t1 = System.currentTimeMillis();
			for (int i = 1; i <= veces; i++) {
				boolean esta = ts.contains(-1);
			}
			t2 = System.currentTimeMillis();
			long tiempoTs = t2 - t1;

			// Busquedas en treeset
			t1 = System.currentTimeMillis();
			for (int i = 1; i <= veces; i++) {
				boolean esta = hs.contains(-1);
			}
			t2 = System.currentTimeMillis();
			long tiempoHs = t2 - t1;

			System.out.format("Buscar %10d elementos - TS: %10d - HS: %10d%n", 
					veces, tiempoTs, tiempoHs);
		}

	}
}
