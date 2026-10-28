package _03ejercicios;

import java.util.Scanner;

public class _01Edades {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int suma = 0;
		for(int cont = 0; cont < 5; cont ++){
			System.out.println("Edad " + (cont+1) + ": ");
			int edad = tec.nextInt();
			suma = suma + edad;
		}
		System.out.println("Media: " + ((suma / 5.0)));
	}

}
