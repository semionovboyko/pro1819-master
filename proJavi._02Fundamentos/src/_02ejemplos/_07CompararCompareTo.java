package _02ejemplos;

import java.util.Scanner;

public class _07CompararCompareTo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String s1 = "ama";
		String s2 = "amo";
		String s3 = "Barco";
		String s4 = "Barco";
		
		//compareTo devuelve un número entero
		System.out.println(s1.compareTo(s2)); //menor que cero
		System.out.println(s1.compareTo(s3)); //mayor que cero
		System.out.println(s3.compareTo(s4)); //igual a cero
		
		//Leer dos nombres y mostrarlos en orden alfabético
		String nombre1, nombre2;
		System.out.println("Introduce nombre 1: ");
		nombre1 = tec.nextLine();

		System.out.println("Introduce nombre 2: ");
		nombre2 = tec.nextLine();
		
		if(nombre1.compareTo(nombre2) < 0){
			System.out.println(nombre1);
			System.out.println(nombre2);
		} else {
			System.out.println(nombre2);
			System.out.println(nombre1);
		}
	}
}
