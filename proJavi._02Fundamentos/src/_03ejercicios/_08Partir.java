package _03ejercicios;

import java.util.Scanner;

public class _08Partir {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Texto: ");
		String texto = tec.nextLine();
		System.out.println("Posición: ");
		int pos = tec.nextInt();
		
		if(pos < 0 || pos >= texto.length()) {
			System.out.println("Posición incorrecta. No se puede partir");
		} else {
			char c = texto.charAt(pos);
			if(c != ' ') {
				System.out.println("No hay un blanco. No se puede partir");
			} else {
				System.out.println(texto.substring(0, pos));
				System.out.println(texto.substring(pos+1));
			}
		}
	}
}
