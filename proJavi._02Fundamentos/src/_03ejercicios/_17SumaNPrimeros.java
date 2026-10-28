package _03ejercicios;

import java.util.Scanner;

public class _17SumaNPrimeros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int num = 1;
		int total = 0;
		while(num <= n) {
			//Añado num al total
			total = total + num;
			
			
			num = num + 1;
		}
		System.out.println("Suma: " + total);
		
	}
}
