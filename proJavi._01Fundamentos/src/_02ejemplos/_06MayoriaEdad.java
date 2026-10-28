package _02ejemplos;

import java.util.Scanner;

public class _06MayoriaEdad {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = tec.nextInt();

		if (edad >= 18) {
			System.out.println("Tienes " + edad + " años");
			System.out.println("Eres MAYOR de edad");
		} else {
			System.out.println("Tienes " + edad + " años");
			System.out.println("Eres menor de edad");
		}
		
		//Cuando solo hay una instrucción se pueden
		//poner las llaves o no 
		System.out.println("Tienes " + edad + " años");
		if (edad >= 18) 
			System.out.println("Eres MAYOR de edad");
		else {
			System.out.println("Eres menor de edad");
		}
	}
}
