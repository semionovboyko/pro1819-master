package _04ejerciciosBuclesAnidados;

import java.util.Scanner;

public class _03NotasPorAsignatura {
	final static int A = 3; //Alumnos
	final static int S = 2; //Asignaturas
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Con cada alumno ...
		for (int asig = 1; asig <= S; asig++){
			System.out.println("Asignatura " + asig + ": ");
			
			//Leer las notas de las asignaturas
			for(int alu = 1; alu <= A; alu++){
				System.out.print("Introduce nota del alumno " + alu + ": ");
				double nota = tec.nextDouble();
			}
		}
		
	}
}
