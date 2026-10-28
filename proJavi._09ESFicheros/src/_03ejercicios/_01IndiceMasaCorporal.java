package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _01IndiceMasaCorporal {
	/* 
	 * Dado un fichero "PesosYEstaturas.txt", que contiene peso y estatura
	 * de una serie de personas (doubles)
	 * nombre
	 * peso
	 * estatura
	 * nombre
	 * peso
	 * estatura
	 * nombre
	 * peso
	 * ...
	 * 
	 * Programa que muestre el nombre y el IMC de cada persona del fichero
	 * imc = peso / estatura a cuadrado
	 */
	public static void main(String[] args) {
		
		Scanner f = null;
		try{
			f = new Scanner(new File("PesosYEstaturas.txt"));
			while(f.hasNextLine()){
				String nombre = f.nextLine();
				double peso = f.nextDouble();
				double est = f.nextDouble();
				if(f.hasNextLine()) f.nextLine(); //Consumir intro que se deja el ultimo nextDouble()
				System.out.println(nombre + " IMC: " + peso /(est*est));
			}
			
			
		} catch (FileNotFoundException e){
			System.out.println("Error de apertura");
		} finally{
			if(f!=null) f.close();
		}
	}
}
