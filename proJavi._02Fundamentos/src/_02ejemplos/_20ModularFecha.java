package _02ejemplos;

import java.util.Calendar;
import java.util.Scanner;

public class _20ModularFecha {
	public static void main(String[] args) {
		Calendar ahora = Calendar.getInstance();
		int dia = ahora.get(Calendar.DAY_OF_MONTH);
		int mes = ahora.get(Calendar.MONTH) + 1;
		int anyo = ahora.get(Calendar.YEAR);
		
		int hora = ahora.get(Calendar.HOUR_OF_DAY);
		int min = ahora.get(Calendar.MINUTE);
		int seg = ahora.get(Calendar.SECOND);
		
		//Mostramos la fecha del sistema con cierto formato
		String fecha = formatearFecha(dia,mes,anyo);
		System.out.println(fecha);
		
		//Mostrar la hora del sistema con cierto formato
		String tiempo = formatearTiempo(hora,min,seg);
		
	}
	// Dada una fecha en forma de dia mes y anyo, devuelve un String
	// con el aspecto dd/mm/aaaa correspondiente a esa fecha
	
	public static String formatearFecha(int dia, int mes, int anyo){
		String texto = rellenarCero(dia) + "/" 
					+ rellenarCero(mes) + "/" + anyo;
		
		return texto;
	}
	
	public static String formatearTiempo(int hora, int min, int seg){
		String texto = rellenarCero(hora) + ":" +  
						rellenarCero(min) + ":" +
						rellenarCero(seg) ;
		
		return texto;
	}
	
	//Rellena con ceros por la izquierda los numeros menores que 10
	public static String rellenarCero(int num) {
		if(num < 10) {
			return "0" + num;
		} else {
			return "" + num;
		}
	}
}
