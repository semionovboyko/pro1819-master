package ejercicio5;

public class Genericidad {
	public static int entreDosValores(int v[], int valor1, int valor2){
		int cont = 0;
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i] >= valor1 && v[i] <= valor2){
				cont++;
			} else if(v[i]>valor2){
				enc = true;
			}
		}
		return cont;
	}
	public static int entreDosValores(Object v[], Object valor1, Object valor2){
		int cont = 0;
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(((Comparable)v[i]).compareTo(valor1) >= 0
					&& ((Comparable)v[i]).compareTo(valor2) <= 0){
				cont++;
			} else if(((Comparable)v[i]).compareTo(valor2) > 0){
				enc = true;
			}
		}
		return cont;
	}
	public static <T extends Comparable<T>>  int entreDosValores2(T v[], T valor1, T valor2){
		int cont = 0;
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if(v[i].compareTo(valor1) >= 0
					&& (v[i]).compareTo(valor2) <= 0){
				cont++;
			} else if(v[i].compareTo(valor2) > 0){
				enc = true;
			}
		}
		return cont;
	}
}
