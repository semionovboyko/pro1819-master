package _02ejemplos._02Sets;

import java.util.Scanner;
import java.util.TreeSet;

public class _01TreeSet {
	public static void main(String[] args) {
		//Un set resulta útil para almacenar colecciones
		//de elementos que no pueden tener duplicados
		
		//Si además, la implementación es TreeSet, podremos
		// recorrer la coleccion por orden (orden del 
		// compareTo del objeto que se inserta en el Set)
		
		
		TreeSet<Integer> s = new TreeSet<>();
		s.add(20); //añade y devuelve true
		s.add(20); //no añade y devuelve false
		s.add(20); //no añade y devuelve false
		System.out.println("Set no duplica: " + s);
		s.add(100);
		s.add(10);
		s.add(15);
		s.add(2);
		System.out.println("TreeSet Ordena: " + s);

		//Los objetos que añadimos tienen que implementar Comparable
		//El siguiente codigo dará ERROR DE EJECUCION
		TreeSet<Scanner> sErroneo = new TreeSet<>();
		sErroneo.add(new Scanner(System.in));

	}
}


