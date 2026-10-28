package _02ejemplos;

import java.util.Scanner;

public class _19Modular {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce cateto 1: ");
		double c1 = tec.nextDouble();
		System.out.println("Introduce cateto 2: ");
		double c2 = tec.nextDouble();
		
		//Llamamos al método hipotenusa. 
		// Tenemos que darle 2 parámetros.
		// Devuelve un double, que podemos guardar en una variable
		double h = hipotenusa(c1, c2);
		System.out.println("Hipotenusa: " + h);
		
		//También podemos imprimir "al vuelo"
		System.out.println("Hipotenusa: " + hipotenusa(c1,c2));

		//También podemos imprimir usar en otras expresiones
		System.out.format("Hipotenusa: %5.2f %n", hipotenusa(c1,c2));

	}
	
	//Metodo que calcula la hipotenusa a partir de los dos catetos.
	//Devuelve un double. El return del método ha de devolver un 
	// double (o compatible)
	//Recibe dos parámetros de tipo double
	public static double hipotenusa (double cat1, double cat2){
		double h = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		return h;
	}
}








