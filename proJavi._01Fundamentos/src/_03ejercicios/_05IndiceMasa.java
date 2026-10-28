package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class _05IndiceMasa {
	public static void main(String args[]){
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Estatura: ");
		double est = tec.nextDouble();
		
		System.out.println("Peso: ");
		double peso = tec.nextDouble();
		
		double imc = peso / (est * est);
		System.out.println("IMC: " + imc);
	}
}
