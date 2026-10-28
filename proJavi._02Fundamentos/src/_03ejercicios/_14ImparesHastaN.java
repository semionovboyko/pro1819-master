package _03ejercicios;

import java.util.Scanner;

public class _14ImparesHastaN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int impar = 1;
		while(impar <= n){
			System.out.println(impar);
			
			impar = impar + 2; // preparamos la siguiente iteracion
		}
		
		
		// Una solución peor
		int x = 1;
		while(x <= n){
			if(x % 2 == 1){ //Si es impar, lo muestro
				System.out.println(x);
			}
			x = x + 1;
		}
	}
}
