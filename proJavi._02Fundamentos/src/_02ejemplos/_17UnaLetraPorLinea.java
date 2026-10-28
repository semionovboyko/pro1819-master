package _02ejemplos;

import java.util.Scanner;

public class _17UnaLetraPorLinea {
	//El usuario introduce un texto y mostramos cada letra del 
	// texto en una línea
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce un texto: ");
		String texto = tec.nextLine();
		
		int pos = 0;
		while(pos < texto.length()){
			char letra = texto.charAt(pos);
			System.out.println(letra);
			
			//Incrementamos pos
			pos = pos + 1;
		}
	}

}
