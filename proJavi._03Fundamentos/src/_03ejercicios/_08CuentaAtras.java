package _03ejercicios;

import java.util.Scanner;

public class _08CuentaAtras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		for(int num = n; num >= 0; num--){
			System.out.println(num);
		}
		
	}

}
