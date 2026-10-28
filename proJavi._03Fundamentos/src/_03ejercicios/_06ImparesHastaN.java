package _03ejercicios;

import java.util.Scanner;

public class _06ImparesHastaN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		//Mostramos los números impares que hay entre 1 y n
		for(int impar = 1; impar <= n ;impar = impar + 2) {
			System.out.println(impar);
		}
		
		
	}

}
