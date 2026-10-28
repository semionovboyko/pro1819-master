package _03ejercicios;

import java.util.Scanner;

public class _09SumaNPrimeros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int suma = 0;
		for(int num = 1; num <= n; num++){
			suma += num;
		}
		System.out.println("Suma: " + suma);
		
//		suma = 0;
//		int num;
//		for(num = 1, suma = 0; num <= n; suma += num++){
//			
//		}
//		System.out.println("Suma: " + suma);
	}

}
