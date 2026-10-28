package _02ejemplos._04trayectos;

import java.util.ArrayList;
import java.util.Collections;

import _02ejemplos._01tiempo.Tiempo;

public class TestOrdenarTrayectos {
	public static void main(String[] args) {
		
ArrayList<TrayectoBus> l = new ArrayList<>();
	
l.add(new TrayectoBus("Tr 1","VAL","BCN",new Tiempo(8,0), new Tiempo(11,0)));
l.add(new TrayectoBus("Tr 2","VAL","BCN",new Tiempo(9,0), new Tiempo(12,0)));
l.add(new TrayectoBus("Tr 3","VAL","BCN",new Tiempo(10,0), new Tiempo(13,0)));

l.add(new TrayectoBus("Tr 4","MAD","BCN",new Tiempo(6,0), new Tiempo(10,0)));
l.add(new TrayectoBus("Tr 5","MAD","BCN",new Tiempo(7,0), new Tiempo(11,0)));
l.add(new TrayectoBus("Tr 6","MAD","BCN",new Tiempo(8,0), new Tiempo(12,0)));

l.add(new TrayectoBus("Tr 7","VAL","MAD",new Tiempo(6,0), new Tiempo(10,0)));
l.add(new TrayectoBus("Tr 8","VAL","MAD",new Tiempo(7,0), new Tiempo(11,0)));
l.add(new TrayectoBus("Tr 9","VAL","MAD",new Tiempo(8,0), new Tiempo(12,0)));

//Ordenamos: Ordenara por el criterio que marque el metodo compareTo
// de la clase TrayectoBus
Collections.sort(l);

//Mostramos, cada trayecto en una linea
for(TrayectoBus t: l){
	System.out.println(t);
}

}

}








