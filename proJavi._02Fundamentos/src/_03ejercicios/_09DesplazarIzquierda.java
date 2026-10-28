package _03ejercicios;

import java.util.Scanner;

public class _09DesplazarIzquierda {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Texto: ");
		String texto = tec.nextLine();
		
		String primero = texto.substring(0,1); //Posición cero
		String resto = texto.substring(1); //Del 1 en adelante
		
		String desplazado =  resto + primero;
		System.out.println(desplazado);
	}
}
