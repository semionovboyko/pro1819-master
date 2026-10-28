package _03ejercicios;

import java.util.Scanner;

public class _03Por2 {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int num = tec.nextInt();
		int doble = num * 2;
		
		System.out.println("El doble de " + num + " es " + doble);
		
		//También se podría haber hecho "al vuelo"
		System.out.println("El doble de " + num + " es " + (num * 2));
		
	}
}
