package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _02LeerNumeros {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce nombre del fichero: ");
		String nombreFichero = tec.nextLine();
		
		
		Scanner f = null;
		try{
			//Abrir fichero para leer
			f = new Scanner(new File(nombreFichero));
					
		    //leer informacion del fichero
			int suma = 0;
			int cont = 0;
			while(f.hasNextInt()){
				int num = f.nextInt();
				suma = suma + num;
				cont ++;
			}
			System.out.println("Media: " + (double)suma / cont);
					
					
		} catch(FileNotFoundException e){
			System.out.println("Error al abrir fichero");
		} finally{
			if(f != null){
				f.close();
			}
		}
	}

}
