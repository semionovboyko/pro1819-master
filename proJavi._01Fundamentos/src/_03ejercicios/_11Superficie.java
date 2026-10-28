package _03ejercicios;

import java.util.Scanner;

public class _11Superficie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("SUPERFICIE DE UNA HABITACIÓN");
		System.out.println("Longitud: ");
		int l = tec.nextInt();
		System.out.println("Anchura: ");
		int a = tec.nextInt();
		
		System.out.println("Superficie: " + (l*a) + " metros cuadrados");
	}

}