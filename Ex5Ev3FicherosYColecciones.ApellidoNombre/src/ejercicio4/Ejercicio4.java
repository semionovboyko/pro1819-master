package ejercicio4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
	static List<String> banquillo = new LinkedList<>();
	
	public static void inicializar(){
		banquillo.add("jug6");
		banquillo.add("jug7");
		banquillo.add("jug8");
		banquillo.add("jug9");
		
	}
	public static void cambio(String aBanquillo, String aJugar){
		if(banquillo.contains(aBanquillo)){
			System.out.println("Cambio RECHAZADO. Motivo: El jugador " 
							+ aBanquillo + " no esta jugando");
		} else if(!banquillo.contains(aJugar)){
			System.out.println("Cambio RECHAZADO. Motivo: El jugador " 
					+ aJugar + " no esta en el banquillo");
			
		} else if(banquillo.indexOf(aJugar)>=3){
			System.out.println("Cambio RECHAZADO. Motivo: El jugador " 
					+ aJugar + " esta cansado");
		} else {
			System.out.println("Cambio ACEPTADO");
			banquillo.remove(aJugar);
			banquillo.add(aBanquillo);
		}
	}
	public static void expulsion(String expulsado){
		if (banquillo.contains(expulsado)){
			System.out.println("Expulsion RECHAZADA: " 
					+ expulsado + " no esta jugando");
		} else {
			System.out.println("Expulsion ACEPTADA");
			//Le sustituye el ultimo que se sentó
			banquillo.remove(banquillo.size()-1); 

		}
	}

	public static void main(String[] args) {
		inicializar();
		System.out.println("Situacion inicial: " + banquillo);
		System.out.println("-------------");
		
		System.out.println("Cambiar a jug1 por jug2");
		cambio("jug1","jug2"); // rechazado, no esta en el banquillo
		System.out.println("Banquillo: " + banquillo);
		System.out.println("-------------");

		System.out.println("Cambiar a jug6 por jug7");
		cambio("jug6","jug7"); // no est� jugando
		System.out.println("Banquillo: " + banquillo);
		System.out.println("-------------");
		
		System.out.println("Cambiar a jug1 por jug9");
		cambio("jug1","jug9"); //rechazado, cansado
		System.out.println("Banquillo: " + banquillo);
		System.out.println("-------------");

		System.out.println("Cambiar a jug1 por jug7");
		cambio ("jug1","jug7"); //aceptado
		System.out.println("Banquillo: " + banquillo);
		System.out.println("-------------");

		System.out.println("Cambiar a jug2 por jug9 ");
		cambio("jug2","jug9");  //aceptado
		System.out.println("Banquillo: " + banquillo);
		System.out.println("-------------");

		System.out.println("Expulsar a jug1");
		expulsion("jug1"); //rechazada
		System.out.println("Banquillo: " + banquillo);
		System.out.println("-------------");

		System.out.println("Expulsar a jug5");
		expulsion("jug5"); //aceptada
		System.out.println("Banquillo: " + banquillo);
	}
}
