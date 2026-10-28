package _02ejemplos;

import java.util.Scanner;

public class _03LeerEdad {
	public static void main (String args[]){
		Scanner tec = new Scanner(System.in);
		
		//Pedimos la edad
		System.out.print("Introduce tu edad: ");
		
		//Leemos la edad desde teclado
		//El programa se detiene hasta que el usuario introduce algo
		// y pulsa INTRO
		int edad = tec.nextInt();
		
		
		//Mostramos información al usuario
		System.out.println("Tienes " + edad + " años");
	}

}
