package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01EdadesA {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int suma = 0;
		for(int cont = 0; cont < 5; cont ++){
			try {
				System.out.println("Edad " + (cont+1) + ": ");
				int edad = tec.nextInt();
				if(edad >= 0 && edad <= 110) {
					suma = suma + edad;
				} else {
					System.out.println("Valor de edad incorrecto.");
					cont --; //Para que vuelva a leer la misma edad
				}
			} catch(InputMismatchException e) {
				System.out.println("La edad tiene que ser un número entero");
				tec.nextLine(); //Vaciar teclado
				cont --; //Para que vuelva a leer la misma edad
			}
		}
		System.out.println("Media: " + ((suma / 5.0)));
	}

}
