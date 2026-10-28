package _02ejemplos;

import java.util.Scanner;

public class _07RecorridoVsBusqueda {
	public static void main(String[] args) {
		int[] v = {1,2,8,4,5,10,17};
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce valor entero: ");
		int x = tec.nextInt();
		
		//RECORRIDO: Contar cuántos multiplos de x hay en v
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] % x == 0) {
				cont ++;
			}
		}
		System.out.format("Hay %d multiplos de %d%n", cont, x);
		
		//BUSQUEDA: ¿En qué posición del array está el primer multiplo de x?
		boolean enc = false;
		int i = 0;
		while(i < v.length && !enc){
			if(v[i] % x == 0){
				enc = true;
			} else {
				i++;
			}
		}
		if(enc){
			System.out.format("El primer multiplo de %d esta en la pos %d%n",
					x, i);
		} else {
			System.out.println("No hay ningun multiplo de " + x);
		}
	}
	
	
	
	
	
	
	
	

}
