package _02ejemplos._01tiempo;

import java.util.Arrays;

public class _04Ordenar {
	public static void main(String[] args) {
		//Podemos ordenar un array de elementos de tipo primitivo
		int[] numeros = {10,2,4,9,3,20,12};
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		//Podemos ordenar un array de Strings
		String[] nombres = {"Teresa","Elena","Ana","Carlos"};
		Arrays.sort(nombres);
		System.out.println(Arrays.toString(nombres));
		
		//¿¿¿Podemos ordenar un array de objetos Tiempo???
		//Solo si la clase Tiempo implements Comparable<Tiempo>
		//Es decir, si tiene método compareTo
		
		Tiempo[] tiempos = {new Tiempo(10,10,10), new Tiempo(9,12,14), new Tiempo(9,12,12)};
		Arrays.sort(tiempos);
		System.out.println(Arrays.toString(tiempos));
	}

}
