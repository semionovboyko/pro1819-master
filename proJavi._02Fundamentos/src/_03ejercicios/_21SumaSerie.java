package _03ejercicios;

import java.util.Scanner;

public class _21SumaSerie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int num = 1;
		double total = 0;
		while(num <= n) {
			//Añado 1/num al total
			total = total + (1.0 / (double) num);
			
			num = num + 1;
		}
		System.out.println("Suma: " + total);
		
	}
}
