package _03ejercicios;

import java.util.Scanner;
/**
 * Programa que pide al usuario un radio y muestra
 * la longitud de la circunferencia, el area del 
 * circulo y el volumen de la esfera correspondientes
 * al radio introducido.
 * 
 * El método main de la clase se apoya en tres métodos
 * que calculan los datos necesarios a partir del 
 * radio.
 * 
 * @author javigarcia
 *
 */
public class _23Circulo {
	public static void main(String[] args) {
		// Entrada
		Scanner tec = new Scanner(System.in);
		System.out.println("Radio: ");
		double radio = tec.nextDouble();

		// Calculos
		double longitud, area, volumen;
		longitud = longitudCircunferencia(radio);
		area = areaCirculo(radio);
		volumen = volumenEsfera(radio);

		// Salida
		System.out.format("Longitud: %6.2f%n", longitud);
		System.out.format("Area:     %6.2f%n", area);
		System.out.format("Volumen:  %6.2f%n", volumen);

	}

	/**
	 * Calcula la longitud de una circunferencia. La longitud de la
	 * circunferencia es lo que mide su perímetro.
	 * 
	 * @param radio
	 *            el radio que tiene la circunferencia
	 * @return la longitud de la circunferencia
	 */
	public static double longitudCircunferencia(double radio) {
		double longitud = 2 * Math.PI * radio;
		return longitud;
	}

	/**
	 * Calcula el area de un círculo. El area es la superficie encerrada en el
	 * círculo.
	 * 
	 * @param radio
	 *            el radio que tiene el circulo
	 * @return el area del circulo
	 */
	public static double areaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

	/**
	 * Calcula el volumen de una esfera.
	 * 
	 * @param radio
	 *            el radio que tiene la esfera.
	 * @return el volumen de la esfera
	 */
	public static double volumenEsfera(double radio) {
		return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
	}
}
