package _03ejercicios;

import java.util.Scanner;

public class _07Horas {
	public static void main(String args[]){
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Segundos : ");
		int segundos = tec.nextInt();
		
		int horas = segundos / 3600;
		int restoSegundos = segundos % 3600;
		
		System.out.println("En " + segundos + " segundos hay: ");
		System.out.println(horas + " horas y");
		System.out.println(restoSegundos + " segundos");
	}
}
