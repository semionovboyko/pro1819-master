package _02ejemplos;

import java.util.Scanner;

public class _05Poltergeist {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Edad: ");
		int edad = tec.nextInt(); 
		tec.nextLine();//Vacio el buffer de teclado
		
		System.out.println("Nombre completo: ");
		String nombre = tec.nextLine();
		
		System.out.println("Estatura: ");
		double est = tec.nextDouble();
		
		
		
	}

}
