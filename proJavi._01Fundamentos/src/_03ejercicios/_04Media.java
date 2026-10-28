package _03ejercicios;

import java.util.Scanner;

public class _04Media {
	public static void main(String args[]){
		Scanner tec = new Scanner(System.in);
		int num1, num2,num3;
		
		System.out.print("Escribe primer número: ");
		num1 = tec.nextInt();
		System.out.print("Escribe segundo número: ");
		num2 = tec.nextInt();
		System.out.print("Escribe tercer número: ");
		num3 = tec.nextInt();
		
		double media = (num1 + num2 + num3) / 3.0;
		System.out.println("La media de " + num1 +", " 
							+ num2 + " y " + num3 + " es "  + media);
	}
}
