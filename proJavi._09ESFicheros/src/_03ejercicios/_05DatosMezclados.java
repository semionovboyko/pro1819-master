package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En un fichero de texto que contiene numeros enteros mezclados con otros
 * datos, sin criterio aparente realizar un programa que calcule la media de los
 * enteros
 * 
 * @author javigarcia
 *
 */
public class _05DatosMezclados {
	public static void main(String[] args) {
		try (Scanner f = new Scanner(new File("DatosMezclados.txt"))) {
			int cont = 0;
			int suma = 0;
			while(f.hasNext()){
				if(f.hasNextInt()){
					suma = suma + f.nextInt();
					cont ++;
				} else {
					f.next();
				}
			}
			System.out.println("Media: " + (double)suma/cont);

		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir fichero");
		}
		//Otra solucion: Capturar la excepcion que se produce
		try (Scanner f = new Scanner(new File("DatosMezclados.txt"))) {
			int cont = 0;
			int suma = 0;
			while(f.hasNext()){
				try{
					suma = suma + f.nextInt();
					cont ++;
				} catch (InputMismatchException e){
					f.next(); //Consumo el dato que no es entero
				}
			}
			System.out.println("Media: " + (double)suma/cont);

		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir fichero");
		}

	}
}
