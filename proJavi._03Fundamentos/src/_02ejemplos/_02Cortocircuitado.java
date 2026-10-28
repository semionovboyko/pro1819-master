package _02ejemplos;

import java.util.Scanner;

public class _02Cortocircuitado {
	static Scanner tec = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Con cortocircuitado -----------");
		if(esMayorEdad() && tieneCarnet()) {
			System.out.println("puedes conducir");
		} else {
			System.out.println("no puedes conducir");
		}

		System.out.println("Con NO cortocircuitado -----------");
		if(esMayorEdad() & tieneCarnet()) {
			System.out.println("puedes conducir");
		} else {
			System.out.println("no puedes conducir");
		}

	}
	public static boolean esMayorEdad(){
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		if(edad >= 18){
			return true;
		} else {
			return false;
		}
	}
	public static boolean tieneCarnet(){
		System.out.println("Tienes carnét de conducir (S/N)?: ");
		char carnet = tec.next().toUpperCase().charAt(0);
		if(carnet == 'S'){
			return true;
		} else {
			return false;
		}
	}
}





