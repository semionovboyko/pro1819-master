package _02ejemplos;

import java.util.Scanner;

public class _01Tiempos {
	/* Entradas con las que el programa produce excepcion:
	  	10.20.30
	  	10:20.30
	  	10:20:aa
	 */
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce la hora en formato hh:mm:ss");
		String instante = tec.next();
		
		int segundos = calcularSegundosTranscurridos (instante);
		System.out.println("Segundos transcurridos desde las 00h 00m 00s: ");
		System.out.println(segundos);
	}
	
	public static int calcularSegundosTranscurridos (String instante){
		 int h = extraerHora(instante);
		 int m = extraerMinuto(instante);
		 int s = extraerSegundo(instante);
		 
		 int transcurrido = h * 3600 + m * 60 + s;
		 return transcurrido;
	}
	public static int extraerHora (String instante){
		int posDosPuntos = instante.indexOf(":");
		String sHora = instante.substring(0, posDosPuntos);
		int hora = Integer.valueOf(sHora);
		return hora;
	}
	public static int extraerMinuto(String instante){
		int posDosPuntos1 = instante.indexOf(":");
		int posDosPuntos2 = instante.lastIndexOf(":");
		String sMin = instante.substring(posDosPuntos1 + 1, posDosPuntos2);
		int min = Integer.valueOf(sMin);
		return min;
	}

	public static int extraerSegundo(String instante){
		int posDosPuntos2 = instante.lastIndexOf(":");
		String sSeg = instante.substring(posDosPuntos2 + 1);
		int seg = Integer.valueOf(sSeg);
		return seg;
	}
	
	
	
}
