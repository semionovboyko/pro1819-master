package _04ejpolimorfismo._02mascotas;

import java.util.ArrayList;

import _02ejemplos._04interfaces.Animal;
import _02ejemplos._04interfaces.Gato;
import _02ejemplos._04interfaces.Leon;
import _02ejemplos._04interfaces.Mascota;
import _02ejemplos._04interfaces.Perro;

public class ListaPerrosYGatos {
	public static void main(String[] args) {
		ArrayList<Animal> tiendaAnimales = new ArrayList<>();
		tiendaAnimales.add(new Perro("p1"));
		tiendaAnimales.add(new Perro("p2"));
		tiendaAnimales.add(new Gato("g1"));
		tiendaAnimales.add(new Perro("p3"));
		tiendaAnimales.add(new Perro("p4"));
		tiendaAnimales.add(new Gato("g2"));
		//tiendaAnimales.add(new Leon("g2"));
		
		//Recorrer tienda y jugar con los animales
		for(Animal a: tiendaAnimales){
			System.out.println(a.toString() + " - " + ((Mascota)a).jugar());
		}
		
	}
}
