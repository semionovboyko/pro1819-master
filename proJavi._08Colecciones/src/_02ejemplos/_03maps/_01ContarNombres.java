package _02ejemplos._03maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _01ContarNombres {
	public static void main(String[] args) {
		Map<String, Integer> veces = new HashMap<String, Integer>();
		Scanner tec = new Scanner(System.in);
		String nombre;
		do {
			System.out.print("Nombre: ");
			nombre = tec.nextLine();
			if (!nombre.isEmpty()) {
				//Obtenemos el valor con el que aparece el nombre
				Integer n = veces.get(nombre); 
				if(n == null){
					//El nombre no aparecía hasta ahora.
					veces.put(nombre, 1); //primera vez
				} else {
					//El nombre ya estaba en el map
					veces.put(nombre, n+1); // una vez mas
				}
			}
		} while (!nombre.isEmpty());
		
		System.out.println(veces);
		
		//Recorrido del map
		//1.- Obtener las claves en un Set
		Set<String> nombres = veces.keySet();
		
		//2.- Recorremos el set con las claves
		for(String nom: nombres){
			//3.- Obtenemos el valor con el que aparece el nombre
			Integer n = veces.get(nom);
			
			//4.- Ya tenemos la pareja nom, n
			System.out.println(nom + " aparece " + n + " veces");
		}
		
	}
}
