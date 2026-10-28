package _03ejercicios;

import java.util.Scanner;

public class _11SumaDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce n: ");
		int n = tec.nextInt();
		
		int suma = n;
		
		for(int divisor = 1; divisor <= n/2; divisor++){
			if(n % divisor == 0){
				suma = suma + divisor;
				//suma += divisor;
			}
		}
		System.out.println("Suma de los divisores: " + suma);
	}
	
	
	
	
	

}
