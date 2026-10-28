package _02ejemplos;

import java.util.Scanner;

public class _06SwitchSinBreak {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Qué dia de la semana empiezas a trabajar (1-7): ");
		int dia = tec.nextInt();
		System.out.println("Esta semana trabajas los siguientes dias");
		switch (dia) {
		case 1:
			System.out.println("lunes");
		case 2:
			System.out.println("martes");
		case 3:
			System.out.println("miércoles");
		case 4:
			System.out.println("jueves");
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
		case 7:
			System.out.println("domingo");

		}
	}

}
