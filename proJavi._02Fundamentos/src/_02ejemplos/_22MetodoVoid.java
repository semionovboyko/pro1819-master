package _02ejemplos;

import java.util.Scanner;

public class _22MetodoVoid {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		saludarA(nombre);
	}
	
	public static void saludarA(String nombre){
		System.out.println("******************");
		System.out.println("HOLA " + nombre + "!!!!!!");
		System.out.println("******************");
		
		//Se puede poner return o no ponerlo
		return;
	}
}
