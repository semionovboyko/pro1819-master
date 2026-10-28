package _02ejemplos;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _07BucleLeerBinario {
	public static void main(String[] args) {
		// Para leer un fichero binario completo usamos
		// un bucle infinito.
		// El bucle finalizará cuando se produzca la excepción
		// EOFException (End Of File)
		
		try(DataInputStream f = new DataInputStream(
				new FileInputStream("personas.bin"))){
			
			while(true){
				//leemos una persona
				String nombre = f.readUTF();
				double peso = f.readDouble();
				double estatura = f.readDouble();
				byte dia = f.readByte();
				byte mes = f.readByte();
				short anyo = f.readShort();
				
				System.out.println(nombre);
				System.out.println(peso);
				System.out.println(estatura);
				System.out.println(dia + "/" + mes + "/" + anyo);
				System.out.println("----------------------------");
			}
			
		} catch(EOFException e){
			//Fin del fichero: SILENCIAMOS LA EXCEPCIÓN
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
		}
	}
}
