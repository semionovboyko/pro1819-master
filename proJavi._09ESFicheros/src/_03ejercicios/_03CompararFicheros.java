package _03ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03CompararFicheros {
	public static void main(String[] args) {
		File f1 = new File ("personas.bin");
		File f2 = new File ("personas2.bin");
		File f3 = new File ("notas.txt");
		
		System.out.println(sonIguales(f1,f2));
		System.out.println(sonIguales(f1,f3));
	}

	/**
	 * Comprueba si dos ficheros contienen la misma información
	 * @param f1 Un fichero
	 * @param f2 El otro fichero
	 * @return true si contienen la misma info.
	 */
	public static boolean sonIguales(File f1, File f2){
		if (f1.length() != f2.length()){
			return false;
		} else {
			try(DataInputStream d1 = new DataInputStream(new FileInputStream(f1));
				DataInputStream d2 = new DataInputStream(new FileInputStream(f2))){
				while(true){
					if(d1.readByte() != d2.readByte()){
						return false;
					}
				}
				
			} catch (EOFException e){
				return true;
			} catch (FileNotFoundException e){
				System.out.println("Error al abrir fichero");
				return false;
			} catch (IOException e){
				//Error al cerrar fichero: SILENCIAMOS
				return true;
			}
		}
		
	}
}
