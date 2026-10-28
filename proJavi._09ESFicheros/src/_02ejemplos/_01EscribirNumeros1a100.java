package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _01EscribirNumeros1a100 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero a grabar: ");
		String nombreFichero = tec.nextLine();
		
		//Abrir el fichero para escribir texto en el:
		// - Si el fichero no existe, se crea (la creacion puede fallar)
		// - Si el fichero existe, SE SOBREESCRIBE !!!! (BORRA SU CONTENIDO)
		PrintWriter f = null;
		try{
			f = new PrintWriter(nombreFichero);
			//o bien PrintWriter f = new PrintWriter(new File(nombreFichero));
			
			//Escribir en el fichero
			for(int i = 1; i<= 100; i++){
				f.println(i);
			}
		} catch(FileNotFoundException e){
			System.out.println("Error al crear fichero");
		} finally{
			if(f != null){
				//Cerrar el fichero
				f.close();
			}
		}

	}
}
