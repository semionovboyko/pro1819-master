package _02ejemplos;

import java.util.Scanner;

public class _04ClaseString {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//La clase String permite representar y manipular
		//cadenas de caracteres
		
		//Declaracion y creación de un String
		
		String nombre = new String("Miguel Gomez");
		System.out.println("Te llamas " + nombre);
		System.out.format("Te llamas %s %n ", nombre);
		System.out.format("Te llamas %40s %n ", nombre);
		System.out.format("Te llamas %-40s %n ", nombre);
		
		//Se puede crear un String sin usar new
		String marca = "Audi A8";
		
		
		//Como leer Strings desde teclado
		System.out.println("Introduce tu nombre: ");
		nombre = tec.next(); //o nextLine()
		System.out.format("Te llamas %s %n ", nombre);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
