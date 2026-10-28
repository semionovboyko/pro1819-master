package _02ejemplos;

import java.io.File;
import java.util.Date;

public class _02OtrasConsultas {
	public static void main(String[] args) {
		File f1 = new File("src");
		
		System.out.println("Exists() : " + f1.exists());
		System.out.println("isDirectory() : " + f1.isDirectory());
		System.out.println("isFile() : " + f1.isFile());
		
		File f2 = new File(f1,"ejemplo.java");
		System.out.println("Exists() : " + f2.exists());
		System.out.println("isDirectory() : " + f2.isDirectory());
		System.out.println("isFile() : " + f2.isFile());
		
		File f3 = new File("src/_02ejemplos/_01NombreYRuta.java");
		File f4 = new File("src/_02ejemplos");
		
		System.out.println("-------------");
		System.out.println("Length de _01NombreYRuta.java: " + f3.length());
		System.out.println("Length de _02ejemplos: " + f4.length());
		
		System.out.println("------ LastModified ------");
		System.out.println("LastModified _01NombreYRuta.java: " + f3.lastModified());
		System.out.println("LastModified de _02ejemplos: " + f4.lastModified());
		
		System.out.println("LastModified _01NombreYRuta.java: " + new Date(f3.lastModified()));
		}

}
