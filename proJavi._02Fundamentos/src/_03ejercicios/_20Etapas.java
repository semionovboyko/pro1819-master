package _03ejercicios;

import java.util.Scanner;

public class _20Etapas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce numero de personas: ");
		int  n = tec.nextInt();
		int inf, pub, ado, adu, vej, anc;
		inf = pub = ado = adu = vej = anc = 0;
		
		
		//Pedimos las n edades
		int cont = 0;
		while (cont < n) {
			System.out.println("Edad "+ (cont + 1) + ": ");
			int edad = tec.nextInt();

			//Procesamos la edad introducida
			if(edad <= 10) {
				inf = inf + 1;
			} else if(edad <= 14) {
				pub = pub + 1;
			} else if(edad <= 21) {
				ado = ado + 1;
			} else if(edad <= 55) {
				adu = adu + 1;
			} else if(edad <= 70) {
				vej = vej + 1;
			} else {
				anc = anc + 1;
			}
		
			
			//Incremento contador
			cont = cont + 1;
			
		}
		// Mostramos los resultados
		System.out.format("%-12s %5.2f %% %n", "Infancia",(100.0 * inf / n));
		System.out.format("%-12s %5.2f %% %n", "Pubertad",(100.0 * pub / n));
		System.out.format("%-12s %5.2f %% %n", "Adolescencia",(100.0 * ado / n));
		System.out.format("%-12s %5.2f %% %n", "Adultez",(100.0 * adu / n));
		System.out.format("%-12s %5.2f %% %n", "Vejez",(100.0 * vej / n));
		System.out.format("%-12s %5.2f %% %n", "Ancianidad",((double) anc / n * 100));
		
		
		
	}
}
