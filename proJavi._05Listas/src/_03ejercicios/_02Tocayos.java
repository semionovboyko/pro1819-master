package _03ejercicios;

import java.util.ArrayList;

public class _02Tocayos {
	/*
	 * Ejercicio9 del boletín de arrays	
	 * Dados dos ArrayList<String> con nombres de personas,
	 * mostrar, qué personas del primer arrayList tienen 
	 * un tocayo en el segundo
	 */
	public static void main(String[] args) {
		ArrayList<String> grupo1 = new ArrayList<>();
		grupo1.add("Miguel");
		grupo1.add("Luis");
		grupo1.add("Alvaro");
		grupo1.add("Pedro");
		
		ArrayList<String> grupo2 = new ArrayList<>();
		grupo2.add("Pedro");
		grupo2.add("Ana");
		grupo2.add("Rosa");
		grupo2.add("Alvaro");
		grupo2.add("Gerardo");
		grupo2.add("Angel");
		grupo2.add("Fernando");
		
		//Recorremos grupo 1
		for(int i= 0; i < grupo1.size(); i++){
			String n = grupo1.get(i);
			//Comprobar si n está en el grupo 2
			//if(grupo2.indexOf(n) != -1)
			if(grupo2.contains(n)){
				System.out.println(n + " tiene un tocayo en el grupo 2");
			}
		}
		
		//Recorriendo con for-each
		for(String n: grupo1){
			if(grupo2.contains(n)){
				System.out.println(n + " tiene un tocayo en el grupo 2");
			}
		}

		
		
	}

}
