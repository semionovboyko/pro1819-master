package _03ejercicios;

import java.util.Scanner;

public class _18MenorDeDos1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Introduce dos números distintos: ");
		int num1 = tec.nextInt();
		int num2 = tec.nextInt();

		if(num1 < num2) {
			System.out.println("Menor: " + num1);
		} else {
			System.out.println("Menor: " + num2);
		}
		//De otra forma 
		if(num1 > num2){
			System.out.println("Menor: " + num2);
		} else {
			System.out.println("Menor: " + num1);
		}
	}
}
