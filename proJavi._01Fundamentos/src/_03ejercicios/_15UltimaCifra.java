package _03ejercicios;

import java.util.Scanner;

public class _15UltimaCifra {
	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce número entero: ");
		int num = tec.nextInt();
		int penultimaCifra = num / 10 % 10;
		int penultimaCifra2 = num % 100 /10;
		
		System.out.format("La penúltima cifra de %d es %d%n",num,penultimaCifra);
		System.out.format("La penúltima cifra de %d es %d%n",num,penultimaCifra2);
	}

}
