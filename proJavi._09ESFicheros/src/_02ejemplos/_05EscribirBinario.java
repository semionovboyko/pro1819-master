package _02ejemplos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _05EscribirBinario {
	public static void main(String[] args) {
		//Para escribir informacion binaria (int, double, ....)
		//usaremos la clase DataOutputStream. Métodos:
		// - writeInt()
		// - writeDouble();
		// - writeUTF() para Strings
		//DataOutputStream no esta preparado para escribir directamente
		// en un fichero. Necesita apoyarse en otro objeto: FileOutputStream
		
		try(DataOutputStream f = new DataOutputStream(
				new FileOutputStream("personas.bin"))){
			
			f.writeUTF("Miguel González");
			f.writeDouble(80.5); //peso
			f.writeDouble(1.80); //estatura
			//Fecha nacimiento
			f.writeByte(23);
			f.writeByte(2);
			f.writeShort(2000);
			
			f.writeUTF("Ana Lozano");
			f.writeDouble(60.5); //peso
			f.writeDouble(1.67); //estatura
			//Fecha nacimiento
			f.writeByte(12);
			f.writeByte(1);
			f.writeShort(2001);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
			
		} catch (IOException e) {
			
		}
	}
}
