package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _11ExcepcionComprobada {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		while (!ok) {
			try {
				System.out.println("Calcular media de edades de un fichero");
				System.out.println("Introduce nombre fichero: ");
				String nombreFich = tec.nextLine();

				double media = calcularMedia(nombreFich);
				System.out.println("Media: " + media);
				ok = true;
			} catch (FileNotFoundException e) {
				System.out.println("El fichero que has indicado no existe");
			}
		}
	}

	public static double calcularMedia(String nombreFich) throws FileNotFoundException {
		// Creamos un objeto Scanner que lea del fichero

		Scanner f = new Scanner(new File(nombreFich)); // Abrir fichero
		int cont = 0;
		int suma = 0;

		// leer fichero
		while (f.hasNext()) {
			int edad = f.nextInt();
			suma = suma + edad;
			cont++;
		}
		f.close(); // Cerramos el fichero
		return (double) suma / cont;
	}

}
