package _02ejemplos;

import java.util.Scanner;

public class _08ForContarVocales {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		String frase = tec.nextLine().toLowerCase();
		
		int contVocales = 0;
		for (int pos = 0; pos < frase.length(); pos++) {
			char letra = frase.charAt(pos);
			if (letra == 'a' || letra == 'e' || letra == 'i' 
					|| letra == 'o' || letra == 'u') {
				contVocales++;
			}
			//De otra forma
			if("aeiou".indexOf(letra)!= -1) {
				contVocales++;
			}
		}
		System.out.println("Numero de vocales: " + contVocales);
	}
}
