package _03ejercicios;

import java.util.Scanner;

public class _15NImpares {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int cont = 0;
		int impar = 1;
		while(cont < n){
			System.out.println(impar);
			impar = impar + 2;
			
			cont = cont + 1;
		}
	}
}
