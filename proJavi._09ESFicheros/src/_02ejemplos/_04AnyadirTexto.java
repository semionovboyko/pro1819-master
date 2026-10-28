package _02ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _04AnyadirTexto {
	public static void main(String[] args) {
		//Anyadimos al fichero blog.txt el texto que escriba el 
		// usuario por teclado
		
		//Leemos texto de teclado
		Scanner tec = new Scanner(System.in);
		System.out.println("Texto a anyadir: ");
		String texto = tec.nextLine();
		
		//Anyadir el texto al fichero
		//Para anyadir info al fichero se crea el PrintWriter
		// a partir de un FileWriter. Este constructor de FileWriter
		// admite un boolean (append) que se pasa a true si lo 
		// que queremos es anyadir (o false si queremos sobreescribir)
		try(PrintWriter f = new PrintWriter(new FileWriter("blog.txt",true))){
			f.println(texto);
		} catch (IOException e) {
			System.out.println("Error al abrir/crear el fichero");
		}
	}
}
