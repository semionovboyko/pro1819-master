package _03ejercicios;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _02CarpetasVacias {
	public static void main(String[] args) {
		//Pedir nombre de carpeta al usuario.
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		File carpeta = new File(nombreCarpeta);
		if(!carpeta.exists()){
			System.out.println(nombreCarpeta + " no existe");
		} else if (!carpeta.isDirectory()){
			System.out.println(nombreCarpeta + " no es una carpeta");
		} else {
			//Llamar a buscarVacias
			List<File> vacias = buscarVacias(carpeta);
			//Mostrar lo que devuelve
			for(File f: vacias){
				System.out.println(f.getPath());
			}
		}
		
	}
	/**
	 * Dada una carpeta, devuelve una lista con las carpetas
	 * vacias que contiene
	 * 
	 * @param carpeta
	 * @return
	 */
	public static List<File> buscarVacias(File carpeta){
		ArrayList<File> result = new ArrayList<>();
		
		LinkedList<File> pendientes = new LinkedList<>();
		pendientes.add(carpeta);
		while(!pendientes.isEmpty()){
			File c = pendientes.get(0);
			pendientes.remove(0);
			
			File[] contenido = c.listFiles();
			if(contenido.length == 0){
				result.add(c);
			} else {
				for (int i = 0; i < contenido.length; i++) {
					if(contenido[i].isDirectory()){
						pendientes.add(contenido[i]);
					}
				}
			}
		}
		return result;
	}
}











