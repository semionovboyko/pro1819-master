package _03ejercicios;

import java.util.Scanner;

public class _16CuentaAtras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int num = n;
		while (num >= 0) {
			System.out.println(num);
			num = num - 1;
		}
		
		//Otra forma: Decrementando el propio n
		System.out.println("-----------");
		while(n >= 0){
			System.out.println(n);
			n = n - 1;
		}
		
	}
}
