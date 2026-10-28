package _03ejercicios;

import java.util.Scanner;

public class _13Segundos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int segundos, d, h, m, s;
		System.out.println("Segundos: ");
		segundos = tec.nextInt();
		
		//dias
		d = segundos / 86400;
		s = segundos % 86400;
		
		//horas
		h = s / 3600;
		s = s % 3600;
		
		//minutos
		m = s / 60;
		s = s % 60;
		
		System.out.println("En " + segundos + " segundos hay ");
		System.out.println(d + " dias");
		System.out.println(h + " horas");
		System.out.println(m + " minutos");
		System.out.println(s + " segundos");
		
		//De otra forma
		s = segundos % 60;
		m = segundos / 60;
		
		h = m / 60;
		m = m % 60;
		
		d = h / 24;
		h = h % 24;
		
		System.out.println("En " + segundos + " segundos hay ");
		System.out.println(d + " dias");
		System.out.println(h + " horas");
		System.out.println(m + " minutos");
		System.out.println(s + " segundos");
		
		
	}
}
