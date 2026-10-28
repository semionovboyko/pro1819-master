package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _04DiezNombres {
	// Programa que guarda hasta 10 nombres en un fichero de texto.
	// El programa termina cuando se completan los 10 o cuando
	// el usuario deja el nombre en blanco.
	// Si el fichero ya contiene nombres, como máximo se añaden
	// los que faltan hasta completar 10

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		// Comprobar cuantos nombres hay ya en el fichero
		int cont = 0;
		try (Scanner f = new Scanner(new File("DiezNombres.txt"))) {
			while (f.hasNextLine()) {
				f.nextLine();
				cont++;
			}
		} catch (FileNotFoundException e) {
			// Cero nombres.
		}

		boolean append = true;
		boolean abandonar = false;
		if (cont >= 10) {
			// El fichero esta completo
			System.out.println("Fichero completo. Empezar de cero (s/n)?: ");
			String respuesta = tec.nextLine().toUpperCase().substring(0, 1);
			if (respuesta.equals("S")) {
				append = false;
				cont = 0;
			} else {
				abandonar = true;
			}
		}

		if (!abandonar) {
			// Grabar los nombres que faltan
			try (PrintWriter f = new PrintWriter(new FileWriter("DiezNombres.txt", append))) {
				String nombre = "";

				do {
					System.out.println("Nombre " + (cont + 1) + ": ");
					nombre = tec.nextLine();
					if (!nombre.isEmpty()) {
						cont++;
						f.println(nombre);
					}
				} while (cont < 10 && !nombre.isEmpty());

			} catch (IOException e) {
				System.out.println("Error al abrir fichero");
			}
		}
	}
}
