package _02ejemplos._04interfaces;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Animal> lista = new ArrayList<>();
		
		lista.add(new Perro("Tom"));
		lista.add(new Gato("Garfield"));
		lista.add(new Leon("Simba"));
		lista.add(new Lobo("Feroz"));
		
		//Mostramos la lista.
		for(Animal a: lista){
			System.out.println(a);
			System.out.println("Come " + a.alimentar());
			System.out.println("---------");
			
		}
	}
}
