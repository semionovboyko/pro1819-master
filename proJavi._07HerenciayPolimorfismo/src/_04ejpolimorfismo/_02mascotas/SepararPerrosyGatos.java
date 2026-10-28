package _04ejpolimorfismo._02mascotas;

import java.util.ArrayList;

import _02ejemplos._04interfaces.Animal;
import _02ejemplos._04interfaces.Gato;
import _02ejemplos._04interfaces.Leon;
import _02ejemplos._04interfaces.Mascota;
import _02ejemplos._04interfaces.Perro;

public class SepararPerrosyGatos {
	public static void main(String[] args) {
		ArrayList<Animal> tiendaAnimales = new ArrayList<>();
		tiendaAnimales.add(new Perro("p1"));
		tiendaAnimales.add(new Perro("p2"));
		tiendaAnimales.add(new Gato("g1"));
		tiendaAnimales.add(new Perro("p3"));
		tiendaAnimales.add(new Perro("p4"));
		tiendaAnimales.add(new Gato("g2"));
		
		//Separar los elementos en dos arrayList, uno con los 
		//Perros y otro con los Gatos
		ArrayList<Perro> perros = new ArrayList<>();
		ArrayList<Gato> gatos = new ArrayList<>();
		
		for(Animal a: tiendaAnimales){
			if(a instanceof Perro){
				perros.add((Perro)a);
			} else if( a instanceof Gato){
				gatos.add((Gato) a);
			}
		}
		
	}
}
