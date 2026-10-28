package _03ejercicios;

import java.io.File;
import java.util.Scanner;

/**
 * Se pide al usuario el nombre de una carpeta.
 * El programa graba en el fichero proyectos.txt 
 * el nombre de todos los proyectos de eclipse que 
 * contiene la carpeta.
 * 
 * Un proyecto de eclipse es una carpeta que contiene:
 * - un fichero llamado .classpath
 * - un fichero llamado .project
 * - una carpeta llamada .settings
 *
 */
public class _06BuscarProyectosEclipse {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce carpeta a explorar: ");
		String nombreWksp = tec.nextLine();
		File fWksp = new File(nombreWksp);
		if(fWksp.isDirectory()){
			//Exploramos el contenido de fWksp
			File[] contenido = fWksp.listFiles();
			for(File proyecto: contenido){
				if(esProyecto(proyecto)){
					System.out.println(proyecto.getName());
				}
			}
		} else {
			System.out.println("No es una carpeta o no existe");
		}
	}
	public static boolean esProyecto(File p){
		if(p.isDirectory()) {
			File fClasspath = new File(p,".classpath");
			File fProject = new File(p,".project");
			File fSettings = new File(p,".settings");
			
			if(fClasspath.isFile() && fProject.isFile() && fSettings.isDirectory()){
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
}
