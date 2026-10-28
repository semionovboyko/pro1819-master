package _02ejemplos;

import java.io.File;
import java.util.Scanner;

public class _04ListFiles {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce nombre de carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File carpeta = new File(nombreCarpeta);
		if(!carpeta.exists()){
			System.out.println("La carpeta indicada no existe");
		} else if (!carpeta.isDirectory()){
			System.out.println("No es una carpeta");
		} else {
			//Es una carpeta que existe
			//Recorremos y mostramos nombre y tamanyo de los ficheros
			// que contiene
			File[] contenido = carpeta.listFiles();
			for (int i = 0; i < contenido.length; i++) {
				if(contenido[i].isFile()){
					System.out.format("%s - %d%n", contenido[i].getName(),
							contenido[i].length());
				}
			}
			
		}
	}
}
