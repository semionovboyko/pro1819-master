package _03ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresNMejorada {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		long n = tec.nextLong();
		
		//Instante de tiempo antes de empezar
		long t1 = System.currentTimeMillis();
		
		long d = 1;
		while(d <= n/2){
			if(n % d == 0) {
				System.out.println(d);
			}
			
			d = d + 1;
		}
		System.out.println(n); //Ultimo divisor
		
		//Instante al finalizar
		long t2 = System.currentTimeMillis();
		
		System.out.println("TIEMPO: " + (t2 - t1));
		
	}
}
