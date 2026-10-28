package ejercicio2;

import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File carpeta = new File(nombreCarpeta);
		if(!carpeta.exists()){
			System.out.println("No existe la carpeta " + nombreCarpeta);
		} else if(!carpeta.isDirectory()){
			System.out.println(nombreCarpeta + " no es una carpeta");
		} else {
			//La carpeta existe. Exploramos su contenido
			File[] contenido = carpeta.listFiles();
			String nombresFichero = "";
			String nombresCarpeta = "";
			StringBuffer sbFicheros = new StringBuffer();
			StringBuffer sbCarpetas = new StringBuffer();
			long bytes = 0;
			int contFicheros = 0;
			int contCarpetas = 0;
			
			for(File f: contenido){
				if (f.isDirectory()){
					nombresCarpeta += f.getName() + "\n";
					sbCarpetas.append(f.getName()+ "\n");
					contCarpetas++;
				} else if (f.isFile()){
					bytes += f.length();
					nombresFichero += f.getAbsolutePath() + "\n";
					sbFicheros.append(f.getAbsolutePath() + "\n");
					contFicheros ++;
				}
			}
			//Mostramos la información
			System.out.format("Contiene %d archivos%n", contFicheros);
			System.out.format("Contiene %d carpetas%n", contCarpetas);
			System.out.println("Las carpetas son: ");
			System.out.println(nombresCarpeta);
			//System.out.println(sbCarpetas.toString());
			
			System.out.println("Los archivos son: ");
			System.out.println(nombresFichero);
			//System.out.println(sbCarpetas.toString());
			System.out.format("Tamanyo total %d bytes", bytes);
		}

	}
}
