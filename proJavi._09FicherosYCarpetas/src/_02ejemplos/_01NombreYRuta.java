package _02ejemplos;

import java.io.File;
import java.io.IOException;

public class _01NombreYRuta {
	public static void main(String[] args) {
		File f1 = new File("carta.doc");
	
		System.out.println("getName(): " + f1.getName()); //carta.doc
		System.out.println("getPath(): " + f1.getPath()); //carta.doc
		System.out.println("getParent(): " + f1.getParent()); //null
		System.out.println("getAbsolutePath(): " + f1.getAbsolutePath()); // /media/......../carta.doc 

		System.out.println("-----------------------------------");
		File f2 = new File("src/_02ejemplos/ejemplo.java");
		System.out.println("getName(): " + f2.getName()); 
		System.out.println("getPath(): " + f2.getPath()); 
		System.out.println("getParent(): " + f2.getParent()); 
		System.out.println("getAbsolutePath(): " + f2.getAbsolutePath());

		System.out.println("------- Importante usar la barra adecuada ----------------");
		File f3 = new File("src\\_02ejemplos\\ejemplo.java");
		System.out.println("getName(): " + f3.getName()); 
		System.out.println("getPath(): " + f3.getPath()); 
		System.out.println("getParent(): " + f3.getParent()); 
		System.out.println("getAbsolutePath(): " + f3.getAbsolutePath());
		
		System.out.println("------- Lo que devuelven depende del String que damos ----------------");
		File f4 = new File("../proJavi._09FicherosYCarpetas/carta.doc");
		System.out.println("getName(): " + f4.getName()); 
		System.out.println("getPath(): " + f4.getPath()); 
		System.out.println("getParent(): " + f4.getParent()); 
		System.out.println("getAbsolutePath(): " + f4.getAbsolutePath());
		
		System.out.println("------- Forma canónica ----------------");
		try {
			System.out.println("getCanonicalPath(): " + f4.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Caracter de separacion en rutas de ficheros y carpetas
		System.out.println(File.separator);
		

	}
}
