package _03ejercicios;

import java.util.Scanner;

public class _19SumaDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		long n = tec.nextLong();
		
		//Instante de tiempo antes de empezar
		long t1 = System.currentTimeMillis();
		
		long d = 1;
		long total = 0; //<<<<<<<<<<<<<<<<<
		while(d <= n/2){
			if(n % d == 0) {
				total = total + d; //<<<<<<<<<<<<<<<<<<<<<<<<
			}
			
			d = d + 1;
		}
		total = total + n; //<<<<<<<<<<<<<<<<<<<<<<<<
		System.out.println("TOTAL: " + total);//<<<<<<<<<<<<<<<<<<<<<<<<
		
		//Instante al finalizar
		long t2 = System.currentTimeMillis();
		
		System.out.println("TIEMPO: " + (t2 - t1));
		
	}
}
