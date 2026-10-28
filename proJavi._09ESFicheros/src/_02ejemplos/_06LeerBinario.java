package _02ejemplos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _06LeerBinario {
	public static void main(String[] args) {
		//Para leer información binaria usamos DataInputStream:
		// - readInt()
		// - readDouble()
		// ...
		// - readUtf()
		//DataInputStream no es capaz de leer de un fichero, sino 
		// de otro Stream. Tenemos que combinarlo con un FileInputStream
		// para poder leer de fichero.
		
		try(DataInputStream f = new DataInputStream(
				new FileInputStream("personas.bin"))){
			//leemos la primera persona
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

			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
		}
	}
}
