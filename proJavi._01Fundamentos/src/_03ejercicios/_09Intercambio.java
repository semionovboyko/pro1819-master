package _03ejercicios;

import java.util.Scanner;

public class _09Intercambio {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Introduce 2 valores: ");
		int a = tec.nextInt();
		int b = tec.nextInt();
		
		System.out.println("Antes: a = " + a + " b = " + b);
		
		//Intercambio
		int aux = a;
		a = b;
		b = aux;
		
		System.out.println("Después: a = " + a + " b = " + b);
	} 

}
