package _02ejemplos._04interfaces;

import java.util.ArrayList;

public class TestJugar {
	public static void main(String[] args) {
		ArrayList<Mascota> tiendaAnimales = new ArrayList<>();
		tiendaAnimales.add(new Perro("p1"));
		tiendaAnimales.add(new Perro("p2"));
		tiendaAnimales.add(new Gato("g1"));
		tiendaAnimales.add(new Perro("p3"));
		tiendaAnimales.add(new Perro("p4"));
		tiendaAnimales.add(new Gato("g2"));
		
		//Recorrer tienda y jugar con los animales
		for(Mascota a: tiendaAnimales){
			System.out.println(a.toString() + " - " + a.jugar());
		}
		
	}
}
