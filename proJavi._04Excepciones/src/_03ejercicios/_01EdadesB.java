package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01EdadesB {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		try {
			boolean ok = true;
			int suma = 0;
			for (int cont = 0; cont < 5 && ok ; cont++) {
				System.out.println("Edad " + (cont + 1) + ": ");
				int edad = tec.nextInt();
				if(edad >= 0 && edad <= 110){
					suma = suma + edad;
				} else {
					ok = false;
				}
			}
			if(ok){
				System.out.println("Media: " + ((suma / 5.0)));
			} else {
				System.out.println("ERROR");
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR");
		}
	}

}
