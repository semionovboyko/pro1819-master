package _03ejercicios;

import java.util.Scanner;

public class _25LetraNif {
	public static void main(String[] args) {
		Scanner tec  = new Scanner (System.in);
		System.out.println("Nif: ");
		String nif = tec.next();
		
		//La letra está en la ultima posición
		char letra = nif.charAt(nif.length() - 1);
		
		//El número llega hasta la penútima posición
		String textoNumero = nif.substring(0, nif.length()-1);
		int numero = Integer.valueOf(textoNumero);
		
		//Comprobar si letra y numero se corresponden
		if(calcularLetraNif(numero) == letra){
			System.out.println("CORRECTO");
		} else {
			System.out.println("INCORRECTO");
		}
	}
	public static char calcularLetraNif(int numero){
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = numero % 23;
		char letra = letras.charAt(resto);
		
		return letra;
	}
	
	public static char calcularLetraNif2(int numero){
		return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero%23);
	}
}
