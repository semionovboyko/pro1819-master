package _03ejercicios;

import java.util.Scanner;

public class _24Salario {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Horas trabajadas: ");
		int hTrabajadas = tec.nextInt();
		double bruto, neto;
		
		//Versión "peor"
		if(hTrabajadas <= 40){
			bruto = hTrabajadas * 8;
			if(bruto <= 350) {
				neto = bruto - (bruto * 2 / 100);
				// Mal: neto = bruto - ((2/100) * bruto );
				// de otra forma
				// neto = bruto - (bruto * 0.02);
				// neto = bruto * 0.98;
			} else /* if(bruto > 350) REDUNDANTE */ {
				neto = bruto - (bruto * 10 / 100);
			}
			System.out.println("Sueldo neto: " + neto);
		} else {
			int hExtra = hTrabajadas - 40;
			
			bruto = 40 * 8 + hExtra * 10;
			if(bruto <= 350) {
				neto = bruto - (bruto * 2 / 100);
			} else {
				neto = bruto - (bruto * 10 / 100);
			}
			System.out.println("Sueldo neto: " + neto);
		}
	}
}
	
	
	
	
	
	
	
	
