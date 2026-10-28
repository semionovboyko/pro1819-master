package _03ejercicios._03contrarreloj;

import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Scanner;

import _02ejemplos._01tiempo.Tiempo;

public class Contrarreloj {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		ListaCorredores hanSalido = new ListaCorredores();
		ListaCorredores hanLlegado = new ListaCorredores();
		int opcion;
		do{
			opcion = menu(new String[] {
					"1.- Registrar salida",
					"2.- Registrar llegada",
					"3.- Mostrar clasificacion",
					"0.- Salir"});
			switch(opcion){
			case 1: 
				registrarSalida(hanSalido);
				System.out.println(hanSalido);
				break;
			case 2: registrarLlegada(hanSalido, hanLlegado); break;
			case 3: mostrarClasificacion(hanLlegado);break;
			case 0: System.out.println("Fin");
			}
		} while (opcion != 0);
	}
	
	public static int menu(String[] opciones){
		int opcion;
		do{
			for (int i = 0; i < opciones.length; i++) {
				System.out.println(opciones[i]);
			}
			System.out.print("Elija una opcion: ");
			opcion = tec.nextInt(); tec.nextLine();
			
		} while (opcion < 0 || opcion >= opciones.length);
		return opcion;
	}
	private static void registrarSalida(ListaCorredores hanSalido) {
		//Pedir el nombre del corredor. Crear un corredor 
		// con ese nombre, dorsal automático y tiempo de salida el
		// la hora del sistema.
		// Anyadirlo a la lista hanSalido
		System.out.print("Nombre corredor: ");
		String n = tec.nextLine();

		//Instante de salida
		int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int m = Calendar.getInstance().get(Calendar.MINUTE);
		int s = Calendar.getInstance().get(Calendar.SECOND);
		Tiempo t = new Tiempo(h,m,s);
		
		//Dorsal
		int d = Corredor.generarDorsal();
		
		//Creo Corredor
		Corredor c = new Corredor(d,n,t);
		//Anyadir a la lista
		hanSalido.anyadir(c);
	}
	private static void registrarLlegada(ListaCorredores hanSalido, ListaCorredores hanLlegado) {
		System.out.println("Que corredor ha llegado? (dorsal): ");
		int d = tec.nextInt();
		
		try{
			Corredor c = hanSalido.quitar(d);
			//Instante de llegada
			int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			int m = Calendar.getInstance().get(Calendar.MINUTE);
			int s = Calendar.getInstance().get(Calendar.SECOND);
			Tiempo t = new Tiempo(h,m,s);
			
			//Cambiar el instante de llegada al corredor
			c.setLlegada(t);
			
			//Insertar en orden en hanLlegado
			hanLlegado.insertarOrdenado(c);
		} catch(NoSuchElementException e){
			System.out.println("Nadie esta corriendo con dorsal " + d);
		}
		
		
	}
	private static void mostrarClasificacion(ListaCorredores hanLlegado) {
		System.out.println(" ========= CLASIFICACION =========");
		System.out.println(hanLlegado.toString());
		
	}

	

	
}
