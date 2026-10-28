package _03ejercicios;

import java.util.Scanner;

public class _07NImpares {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int impar = 1;
		for(int cont = 0; cont < n; cont++){
			System.out.println(impar);
			impar += 2;
		}
		
	}

}
