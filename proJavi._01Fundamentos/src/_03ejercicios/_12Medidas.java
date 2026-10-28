package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;


public class _12Medidas {
	public static void main(String[] args) {
		//Scanner tec = new Scanner(System.in); //Separador es la coma
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
 		System.out.println("Introduce pies: ");
		double pies = tec.nextDouble();
		
		double pulgadas = pies * 12;
		double yardas = pies / 3;
		double cm = pulgadas * 2.54;
		double m = cm / 100;
		
		System.out.println("En " + pies + " pies hay: \n " +
				pulgadas + " pulgadas\n" +
				yardas + " yardas\n"+
				cm + " cm.\n"+
				m + " m." );
		
		System.out.format("En %5.2f pies hay:\n %8.2f pulgadas\n %15.4f yardas\n %15.4f cm.\n %-15.4f m.\n",
				pies, pulgadas, yardas, cm, m);
	}
}
