package _03ejercicios;

import java.util.Scanner;

public class _22NumeroCifras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int cont = 0;
		if(n == 0) {
			cont = 1;
		} else {
			while(n > 0) {
				n = n / 10; 		//quito una cifra a n
				cont = cont + 1;	//cuento
			}
		}
		System.out.println("Cifras: " + cont);
		
		//De otra forma
		System.out.println("Introduce n: ");
		n = tec.nextInt();
		cont = 1; //El numero tendrá al menos una cifra
		while(n >= 10) {
			n = n / 10;
			cont = cont + 1;  
		}
		System.out.println("Cifras: " + cont);
	}
}
