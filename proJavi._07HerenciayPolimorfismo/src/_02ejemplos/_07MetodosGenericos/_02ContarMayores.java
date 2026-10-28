package _02ejemplos._07MetodosGenericos;

import _02ejemplos._06Genericidad.Baloncestista;

public class _02ContarMayores {
	
	public static void main(String[] args) {
		int[] v1 = {1,1,1,1,2,2,2,2,3};
		System.out.println(contarMayores(v1,2));
		
		String[] v2 = {"a","a","a","b","b","c","d"};
		System.out.println(contarMayoresV1(v2,"a"));
		
		Baloncestista[] v3 = {
				new Baloncestista("Pepe"),
				new Baloncestista("Luis")
		};
		
		
		//Error de ejecución: No se puede comparar un String con un Baloncestista
		System.out.println(contarMayoresV1(v2,new Baloncestista("Angel")));
		//Error de ejecución: Baloncestista no implementa Comparable
		System.out.println(contarMayoresV1(v3,new Baloncestista("Angel")));

		//Con la nueva sintaxis detecta los errores antes de ejecutar
		//System.out.println(contarMayoresV2(v2,new Baloncestista("Angel")));
		//System.out.println(contarMayoresV2(v3,new Baloncestista("Angel")));

	
	}
	
	//Devolver cuantos elementos de v son mayores que x
	public static int contarMayores(int[] v, int x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] > x) cont ++;
		}
		return cont;
	}
	
	//Genérico hasta 1.4
	public static int contarMayoresV1(Object[] v, Object x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(((Comparable)v[i]).compareTo(x) > 0) cont ++;
		}
		return cont;
		
	}
	
	//Genérico desde 1.4
	public static <T extends Comparable<T>> int contarMayoresV2(T[] v, T x){
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].compareTo(x) > 0) cont ++;
		}
		return cont;
	}
	
}
