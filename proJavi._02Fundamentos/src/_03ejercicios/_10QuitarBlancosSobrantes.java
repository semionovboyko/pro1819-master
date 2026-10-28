package _03ejercicios;

import java.util.Scanner;

public class _10QuitarBlancosSobrantes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce dos palabras separadas por varios blancos: ");
		String texto = tec.nextLine();
		
		int pos = texto.indexOf(' ');
		String parte1= texto.substring(0,pos); //Posición cero
		String parte2 = texto.substring(pos+1); //Del 1 en adelante
		
		String sinBlancos  =  parte1 + " " + parte2.trim();
		System.out.println(sinBlancos);
	}
}
