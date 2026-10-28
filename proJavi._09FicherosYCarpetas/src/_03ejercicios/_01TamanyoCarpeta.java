package _03ejercicios;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class _01TamanyoCarpeta {
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
			//Recorremos y mostramos su contenido
			LinkedList<File> pendiente = new LinkedList<>();
			//Inicialmente lo único pendiente es la carpeta inicial
			pendiente.add(carpeta); 
			
			long tamTotal = 0;
			
			//Mientras quede algo pendiente
			while(!pendiente.isEmpty()){
				File f = pendiente.get(0); //consultamos carpeta pendiente
				pendiente.remove(0); //deja de estar pendiente
				//System.out.println(f.getPath());
				
				File[] contenido = f.listFiles();
				for (int i =contenido.length-1; i >=0; i--) {
					if(contenido[i].isDirectory()){
						pendiente.add(0,contenido[i]);
					} else if(contenido[i].isFile()){
						tamTotal += contenido[i].length();
					}
				}
			}
			System.out.println(tamTotal);
			
			
			
			
		}
	}
}
