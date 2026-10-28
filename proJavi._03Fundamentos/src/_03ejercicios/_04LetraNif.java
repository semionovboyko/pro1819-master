package _03ejercicios;

import java.util.Scanner;

public class _04LetraNif {
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

		int resto = numero % 23;
		char letra = ' ';
		switch(resto){
		case 0: letra = 'T'; break;
		case 1: letra = 'R'; break;
		case 2: letra = 'W'; break;
		case 3: letra = 'A'; break;
		case 4: letra = 'G'; break;
		case 5: letra = 'M'; break;
		case 6: letra = 'Y'; break;
		case 7: letra = 'F'; break;
		case 8: letra = 'P'; break;
		case 9: letra = 'D'; break;
		case 10: letra = 'X'; break;
		case 11: letra = 'B'; break;
		case 12: letra = 'N'; break;
		case 13: letra = 'J'; break;
		case 14: letra = 'Z'; break;
		case 15: letra = 'S'; break;
		case 16: letra = 'Q'; break;
		case 17: letra = 'V'; break;
		case 18: letra = 'H'; break;
		case 19: letra = 'L'; break;
		case 20: letra = 'C'; break;
		case 21: letra = 'K'; break;
		case 22: letra = 'E'; break;
		}
		return letra;
	}
	public static char calcularLetraNif2(int numero){

		int resto = numero % 23;
		switch(resto){
		case 0:  return 'T'; 
		case 1:  return 'R';
		case 2:  return 'W';
		case 3:  return 'A';
		case 4:  return 'G';
		case 5:  return 'M';
		case 6:  return 'Y';
		case 7:  return 'F';
		case 8:  return 'P';
		case 9:  return 'D';
		case 10: return 'X';
		case 11: return 'B';
		case 12: return 'N';
		case 13: return 'J';
		case 14: return 'Z';
		case 15: return 'S';
		case 16: return 'Q';
		case 17: return 'V';
		case 18: return 'H';
		case 19: return 'L';
		case 20: return 'C';
		case 21: return 'K';
		default: return 'E';
		}
	}
	
	
}
