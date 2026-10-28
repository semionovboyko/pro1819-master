package _02ejemplos._04trayectos;

import _02ejemplos._01tiempo.Tiempo;

public class TestTrayecto {
	public static void main(String[] args) {
		
		//Al constructor hay que pasarle 2 objetos Tiempo
		//Se pueden crear al vuelo ...
		TrayectoBus tr1 = new TrayectoBus("Capital matinero",
				"Valencia", "Madrid", 
				new Tiempo (6,0), new Tiempo(9,45));
		
		//O se pueden crear en variables ....
		Tiempo tIni = new Tiempo(20,5);
		Tiempo tFin = new Tiempo(23,55);
		TrayectoBus tr2 = new TrayectoBus("Regreso nocturno",
				"Madrid","Valencia",tIni,tFin);
		
		System.out.println(tr1);
		System.out.println(tr2);
		
		//Cambiar a tr1 el nombre por "Capital tempranero"
		tr1.setNombre("Capital tampranero");
		System.out.println(tr1);
		
		//Cambiar a tr2 el tiempo de salida por las 19:20:00
		tr2.setSalida(new Tiempo(19,20));
		System.out.println(tr2);
		
		//Cambiar a tr1 el tiempo de llegada por las 9:50
		tr1.getLlegada().setHora(9);
		tr1.getLlegada().setMinuto(50);
		
		//Retrasar 5 minutos la hora de salida de tr1
		tr1.getSalida().anyadirSegundos(300);
		System.out.println(tr1);
		
		//Probar método equals
		TrayectoBus tr3 = new TrayectoBus("a","b","c", 
							new Tiempo(10,10,10), new Tiempo(20,20,20));
		System.out.println(tr3.equals(tr3));
		System.out.println(tr3.equals("pepe"));
		TrayectoBus tr4 = new TrayectoBus("a","b","c", 
				new Tiempo(10,10,10), new Tiempo(20,20,20));
		System.out.println(tr3.equals(tr4));
		
		
	}

}
