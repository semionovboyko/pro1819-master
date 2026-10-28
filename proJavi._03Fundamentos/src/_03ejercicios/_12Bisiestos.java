package _03ejercicios;

import java.util.Scanner;


public class _12Bisiestos {

	public static boolean esBisiesto(int anyo) {
		boolean resultado;
		if (anyo % 4 == 0) {
			if (anyo % 100 == 0) {
				if (anyo % 400 == 0) {
					resultado = true;
				} else {
					resultado = false;
				}
			} else {
				resultado = true;
			}
		} else {
			resultado = false;
		}

		return resultado;
	}

	public static boolean esBisiesto2(int anyo) {
		boolean resultado;
		if (anyo % 400 == 0) {
			resultado = true;
		} else if (anyo % 100 == 0) {
			resultado = false;
		} else if (anyo % 4 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

	public static boolean esBisiesto3(int anyo) {
		// Es bisiesto
		// si es divisible por 400
		// o
		// es divisible por 4 y no por 100
		return anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0;
	}

	public static int diasMes(int mes, int anyo) {
		int dias = 31;
		switch (mes) {
		case 2:
			if (esBisiesto(anyo)) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
		}
		
		return dias;
	}
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in); 
		System.out.println("Mes: ");
		int mes = tec.nextInt();
		System.out.println("Año: ");
		int anyo = tec.nextInt();
		
		System.out.println(diasMes(mes,anyo));
		
		
	}
}
