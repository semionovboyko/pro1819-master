package _03ejercicios;

import java.util.Scanner;

public class _02Division {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce a: ");
		int a = tec.nextInt();
		System.out.println("Introduce b: ");
		int b = tec.nextInt();
		
		System.out.println("a / b = " + (a/b));
	}
	
	//a) Object - Throwable - Excepction - RuntimeException - ArithmeticException
	//b) Object - Throwable - Excepction - RuntimeException 
	//		- NoSuchElementException - InputMismatchException
	//c) Object - Throwable - Excepction - RuntimeException 
	//		- NoSuchElementException - InputMismatchException
}
