package _03ejercicios;

import java.util.Scanner;

public class _24Salario2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Horas trabajadas: ");
		int hTrabajadas = tec.nextInt();
		double bruto, neto;
		
		//Calculamos horas extra y ordinarias
		int hOrdinarias, hExtra;
		if(hTrabajadas <= 40){
			hOrdinarias = hTrabajadas;
			hExtra = 0;
		} else {
			hOrdinarias = 40;
			hExtra = hTrabajadas - 40;
		}
		
		//Bruto
		bruto = hOrdinarias * 8 + hExtra * 10;
		
		//Neto
		if(bruto <= 350) {
			neto = bruto - (bruto * 2 / 100);
		} else {
			neto = bruto - (bruto * 10 / 100);
		}
		
		System.out.println("Ordinarias: " + hOrdinarias);
		System.out.println("Extraordinarias: " + hExtra);
		System.out.println("Sueldo bruto: " + neto);
		System.out.println("Sueldo neto: " + neto);
	}
}
	
	
	
	
	
	
	
	
