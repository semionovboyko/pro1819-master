package _02ejemplos;

import java.util.Scanner;

public class _12BuclesAnidados {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		for(int veces = 0; veces < 3; veces++){
			//Sumar los números entre 1 y n
			System.out.println("Introduce un nº: ");
			int n = tec.nextInt();
			int suma = 0;
			for(int num = 1; num <= n; num++){
				suma = suma + num;
			}
			System.out.format("Los numeros entre 1 y %d suman %d%n", n, suma);
		}
	}
}
