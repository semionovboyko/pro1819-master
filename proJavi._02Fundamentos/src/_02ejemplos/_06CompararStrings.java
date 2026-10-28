package _02ejemplos;

import java.util.Scanner;

public class _06CompararStrings {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce nombre:");
		String nombre = tec.nextLine();
		
		System.out.println("Comparando con == (MAL) ");
		if(nombre == "javi") {
			System.out.println("Te llamas como yo");
		}else {
			System.out.println("Que nombre tan feo");
		}
		
		System.out.println("Comparando con equals (BIEN) ");
		if(nombre.equals("javi")) {
			System.out.println("Te llamas como yo");
		}else {
			System.out.println("Que nombre tan feo");
		}
	}

}
