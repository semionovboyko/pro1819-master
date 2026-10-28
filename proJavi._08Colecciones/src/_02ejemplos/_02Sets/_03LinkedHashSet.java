package _02ejemplos._02Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _03LinkedHashSet {
	public static void main(String[] args) {
		// Un set resulta útil para almacenar colecciones
		// de elementos que no pueden tener duplicados

		// Si además, la implementación es LinkedHashSet,
		// el orden de los elementos será el de introduccion

		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		s.add(20); // añade y devuelve true
		s.add(20); // no añade y devuelve false
		s.add(20); // no añade y devuelve false
		System.out.println("Set no duplica: " + s);
		s.add(100);
		s.add(10);
		s.add(15);
		s.add(2);
		System.out.println("LinkedHashSet mantiene el orden de introduccion: " + s);
		// Los objetos que añadimos NO tienen que implementar Comparable
		// El siguiente codigo NO dará error
		HashSet<Scanner> sErroneo = new HashSet<>();
		sErroneo.add(new Scanner(System.in));
	}
}
