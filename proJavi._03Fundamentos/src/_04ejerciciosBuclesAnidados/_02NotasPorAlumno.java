package _04ejerciciosBuclesAnidados;

import java.util.Scanner;

public class _02NotasPorAlumno {
	final static int A = 3; //Alumnos
	final static int S = 2; //Asignaturas
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Con cada alumno ...
		for (int alu = 1; alu <= A; alu++){
			System.out.println("Alumno " + alu + ": ");
			
			//Leer las notas de las asignaturas
			for(int asig = 1; asig <= S; asig++){
				System.out.print("Introduce nota de la asignatura " + asig + ": ");
				double nota = tec.nextDouble();
			}
		}
		
	}
}
