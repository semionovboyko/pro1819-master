package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _03MezclarNombreYNotas {
	public static void main(String[] args) {

		try (Scanner fNombres = new Scanner(new File("nombres.txt"));
	 		 Scanner fNotas = new Scanner(new File("notas.txt"));
			 PrintWriter fCombinado = new PrintWriter("combinado.txt")) {

			// Mientras quede info en los 2 ficheros
			while (fNombres.hasNextLine() && fNotas.hasNextDouble()) {
				String nombre = fNombres.nextLine();
				double nota = fNotas.nextDouble();
				fCombinado.println(nombre);
				fCombinado.println(nota);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir/crear los ficheros");
		} 
	}
}
