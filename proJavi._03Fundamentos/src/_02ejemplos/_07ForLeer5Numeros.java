package _02ejemplos;

import java.util.Scanner;

public class _07ForLeer5Numeros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//Con WHILE
		int cont = 0;
		while(cont < 5){
			System.out.println("Numero " + (cont +1) +": ");
			int num = tec.nextInt();
			
			cont ++;
		}
	
		//Con FOR
		for (int veces = 0; veces < 5; veces++){
			System.out.println("Numero " + (veces + 1) + ": ");
			int num = tec.nextInt();
		}
	}
}
