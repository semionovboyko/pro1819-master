package _02ejemplos._02Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class _02HashSet {
	public static void main(String[] args) {
		// Un set resulta útil para almacenar colecciones
		// de elementos que no pueden tener duplicados

		// Si además, la implementación es HashSet,
		// el orden de los elementos será indeterminado

		HashSet<Integer> s = new HashSet<>();
		s.add(20); // añade y devuelve true
		s.add(20); // no añade y devuelve false
		s.add(20); // no añade y devuelve false
		System.out.println("Set no duplica: " + s);
		s.add(100);
		s.add(10);
		s.add(15);
		s.add(2);
		System.out.println("HashSet no ordena: " + s);
		// Los objetos que añadimos NO tienen que implementar Comparable
		// El siguiente codigo NO dará error
		HashSet<Scanner> sErroneo = new HashSet<>();
		sErroneo.add(new Scanner(System.in));
	}
}
