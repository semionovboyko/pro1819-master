package _03ejercicios;

import java.util.Scanner;

public class _22Hora12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Hora: ");
		int hora = tec.nextInt();
		System.out.println("Minuto: ");
		int min = tec.nextInt();
		
		System.out.println("Las " + hora + ":" + min + " son las ");
		if(hora == 0) {
			System.out.print("12:" + min + " AM"); 
		} else if(hora <	 12){
			System.out.print(hora + ":" + min + " AM");
		} else if(hora == 12){
			System.out.print("12:" + min + " PM");
		} else {
			System.out.print((hora-12) + ":" + min + " PM");
		}
		
		
		
	}
}
