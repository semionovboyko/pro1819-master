package _02ejemplos;

import java.util.Scanner;

public class _05Switch {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Dia de la semana (1-7): ");
		int dia = tec.nextInt();

		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miércoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		default:
			System.out.println("fin de semana");

		}
	}

}
