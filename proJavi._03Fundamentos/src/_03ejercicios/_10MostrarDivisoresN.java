package _03ejercicios;

import java.util.Scanner;

public class _10MostrarDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		//Solucion lenta
		for(int divisor = 1; divisor <= n; divisor++){
			if(n % divisor == 0){
				System.out.format("%d es divisor de %d%n",divisor,n);
			}
		}
		
		//Solución rápida
		
		for(int divisor = 1; divisor <= n/2; divisor++){
			if(n % divisor == 0){
				System.out.format("%d es divisor de %d%n",divisor,n);
			}
		}

	}

}
