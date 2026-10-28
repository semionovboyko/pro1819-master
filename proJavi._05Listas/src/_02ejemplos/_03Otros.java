package _02ejemplos;

import java.util.ArrayList;

public class _03Otros {
	public static void main(String[] args) {
		ArrayList<Integer> primos = new ArrayList<>();
		
		primos.add(new Integer(1));
		primos.add(new Integer(2));
		primos.add(new Integer(3));
		primos.add(new Integer(5));
		primos.add(7); //Java convierte implicitamente a Integer
		primos.add(9);
		primos.add(11);
		
		//Tamañio del arrayList
		System.out.println(primos.size());
		
		//Consultar un elemento
		Integer x = primos.get(0); // primer elemento de la Lista
		System.out.println(x);
		
		//Añadir o eliminar los elementos de otra lista
		ArrayList<Integer> pares = new ArrayList<>();
		pares.add(2);
		pares.add(4);
		pares.add(6);
		ArrayList<Integer> masPares = new ArrayList<>();
		masPares.add(8);
		masPares.add(10);
		masPares.add(12);
		
		System.out.println("Pares: " + pares.toString());
		System.out.println("Mas pares: " + masPares.toString());
		
		pares.addAll(masPares); //Añadir todos los de masPares
		System.out.println("Pares: " + pares.toString());
		
		
		pares.removeAll(primos); //Quitamos de pares todos los primos
		System.out.println("Pares: " + pares /*.toString()*/ );
	}
}







