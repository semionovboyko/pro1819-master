package ejercicio3;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		boolean append = true;
		Scanner tec = new Scanner(System.in);
		File f = new File("alumnos.txt");
		if(f.exists()){
			System.out.println("El fichero ya existe. Sobreescribir (S/N)?: ");
			String resp = tec.nextLine();
			if(resp.equalsIgnoreCase("S")){
				append = false;
			}
		}
		
		try(
			DataInputStream fNombres = new DataInputStream(new FileInputStream("nombres.dat"));
			DataInputStream fNotas   = new DataInputStream(new FileInputStream("notas.dat"));
			PrintWriter fMezclado 	 = new PrintWriter(new FileWriter("alumnos.txt", append));
		){
			//Leemos hasta que se termine uno de los ficheros
			while(true){
				String nombre = fNombres.readUTF();
				int nota   = fNotas.readInt();
				
				fMezclado.println(nombre);
				fMezclado.println(nota);
				
			}
		} catch (EOFException e){
			//Se ha terminado alguno de los ficheros
		} catch (FileNotFoundException e) {
			System.out.println("Problema al abrir los ficheros");
		} catch (IOException e) {
			System.out.println("Problema al cerrar los ficheros");
		} 
	}

}
