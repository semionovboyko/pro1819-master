package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _02IMCAFichero {
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
	 * Programa que muestre GRABE el nombre y el IMC de cada persona del fichero
	 * imc = peso / estatura a cuadrado
	 * en el fichero IMC.txt
	 */
	public static void main(String[] args) {
		
		Scanner f = null;
		PrintWriter p = null;
		try{
			f = new Scanner(new File("PesosYEstaturas.txt"));
			p = new PrintWriter("IMC.txt");
			
			while(f.hasNextLine()){
				String nombre = f.nextLine();
				double peso = f.nextDouble();
				double est = f.nextDouble();
				if(f.hasNextLine()) f.nextLine(); //Consumir intro que se deja el ultimo nextDouble()
				p.println(nombre + " IMC: " + peso /(est*est));
			}
			
			
		} catch (FileNotFoundException e){
			System.out.println("Error de apertura");
		} finally{
			if(f!=null) f.close();
			if(p!= null) p.close();
		}
	}
}
