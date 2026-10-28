package _03ejercicios;

import java.util.Scanner;

public class _16PenultimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce número entero: ");
		int num = tec.nextInt();
		
		int sinUltima = num / 10;
		int penultimaCifra = sinUltima % 10;
		
		System.out.format("La penúltima cifra es %d\n", penultimaCifra);
		System.out.println("La penúltima cifra es " + penultimaCifra);
		//De otra forma, con una sola operación
		System.out.format("La penúltima cifra es %d", num / 10 % 10);
		
	}
}
