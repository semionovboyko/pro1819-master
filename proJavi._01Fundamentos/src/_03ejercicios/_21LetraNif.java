package _03ejercicios;

import java.util.Scanner;

public class _21LetraNif {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce NIF: ");
		int nif = tec.nextInt();
		
		int modulo = nif % 23;
		if(modulo == 0) System.out.println("T");
		else if(modulo == 1) System.out.println("R");
		else if(modulo == 2) System.out.println("W");
		else if(modulo == 3) System.out.println("A");
		else if(modulo == 4) System.out.println("G");
		else if(modulo == 5) System.out.println("M");
		else if(modulo == 6) System.out.println("Y");
		else if(modulo == 7) System.out.println("F");
		else if(modulo == 8) System.out.println("P");
		else if(modulo == 9) System.out.println("D");
		else if(modulo == 10) System.out.println("X");
		else if(modulo == 11) System.out.println("B");
		else if(modulo == 12) System.out.println("N");
		else if(modulo == 13) System.out.println("J");
		else if(modulo == 14) System.out.println("Z");
		else if(modulo == 15) System.out.println("S");
		else if(modulo == 16) System.out.println("Q");
		else if(modulo == 17) System.out.println("V");
		else if(modulo == 18) System.out.println("H");
		else if(modulo == 19) System.out.println("L");
		else if(modulo == 20) System.out.println("C");
		else if(modulo == 21) System.out.println("K");
		else System.out.println("E");
		
		
		
		
		
		
	}
}
