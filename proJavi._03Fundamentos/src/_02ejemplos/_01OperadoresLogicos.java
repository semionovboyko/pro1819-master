package _02ejemplos;

import java.util.Scanner;

public class _01OperadoresLogicos {
	public static void main(String[] args) {
		//La nota de la asignatura es la media de 
		// - la nota de examen
		// - la nota de prácticas.
		// Solo se hace media a partir de un 4
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Nota del examen: ");
		double notaEx = tec.nextDouble();
		
		System.out.println("Nota de prácticas: ");
		double notaPr = tec.nextDouble();
		
		if(notaEx >= 4 && notaPr >= 4){
			double media = (notaEx + notaPr) / 2;
			System.out.println("Nota media: " + media);
		} else {
			System.out.println("Suspendido. Media insuficiente");
		}
	}
}




