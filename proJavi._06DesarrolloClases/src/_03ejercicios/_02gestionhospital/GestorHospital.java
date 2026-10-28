package _03ejercicios._02gestionhospital;

import java.util.Scanner;

public class GestorHospital {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		System.out.println(h.toString());
		//o System.out.println(h);
		System.out.println(h.primeraLibre());
		
		//Ingresar varios pacientes
		System.out.println("==================");
		try {
			h.ingresarPaciente("Pepe", 20);
			h.ingresarPaciente("Ana", 20);
			h.ingresarPaciente("Luis", 30);
			h.ingresarPaciente("Pablo", 20);
			h.ingresarPaciente("Ramon", 30);
			h.ingresarPaciente("Maria", 20);
			h.ingresarPaciente("Monica", 30);
		} catch (HospitalLlenoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(h);
		Scanner tec = new Scanner(System.in);
		tec.nextLine();
		while(h.getNumLibres() < 10){
			h.darAltas();
			System.out.println("=======================");
			System.out.println(h);
			tec.nextLine();
		}
	}
}
