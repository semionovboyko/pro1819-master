package _02ejemplos._01tiempo;

import java.util.ArrayList;
import java.util.Iterator;

public class _02MostrarHorarioCentro {
	public static void main(String[] args) {
		//Creamos un ArrayList<Tiempo> con las horas de
		//comienzo de cada clase del instituto
		
		ArrayList<Tiempo> horario = new ArrayList<>();
		horario.add(new Tiempo(7,55));
		horario.add(new Tiempo(8,50));
		horario.add(new Tiempo(9,45));
		horario.add(new Tiempo(10,40));
		horario.add(new Tiempo(11,10));
		horario.add(new Tiempo(12,05));
		horario.add(new Tiempo(13,00));
		horario.add(new Tiempo(13,55));
		horario.add(new Tiempo(14,50));
		System.out.println(horario);
		
		for(int i = 0; i < horario.size()-1; i++ ){
			System.out.println(horario.get(i) + " - " + horario.get(i+1));
		}
		
		if(hayQueTocarElTimbre(horario, 10, 40)){
			System.out.println("RIIIIIIIIIIIIING");
		} else {
			System.out.println("En clase .......");
		}
		
	}
	public static boolean hayQueTocarElTimbre (ArrayList<Tiempo> horario, 
			int hora, int minuto){
		Tiempo t = new Tiempo(hora,minuto);
		if(horario.contains(t)){
			return true;
		} else {
			return false;
		}
		
	}

}





