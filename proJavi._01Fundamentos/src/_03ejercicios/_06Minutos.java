package _03ejercicios;

import java.util.Scanner;

public class _06Minutos {
	public static void main(String args[]){
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Segundos : ");
		int segundos = tec.nextInt();
		
		int minutos = segundos / 60;
		int restoSegundos = segundos % 60;
		
		System.out.println("En " + segundos + " segundos hay: ");
		System.out.println(minutos + " minutos y");
		System.out.println(restoSegundos + " segundos");
	}
}
