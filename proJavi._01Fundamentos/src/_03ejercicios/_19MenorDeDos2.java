package _03ejercicios;

import java.util.Scanner;

public class _19MenorDeDos2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce dos números: ");
		int num1 = tec.nextInt();
		int num2 = tec.nextInt();

		if(num1 < num2) {
			System.out.println("Menor: " + num1);
		} else {
			if(num1 > num2){
				System.out.println("Menor: " + num2);
			} else {
				System.out.println("Los números son iguales");
			}
		}
		
	}
}
