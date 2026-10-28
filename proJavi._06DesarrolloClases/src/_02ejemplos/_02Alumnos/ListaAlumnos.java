package _02ejemplos._02Alumnos;

import java.util.ArrayList;
import java.util.Collections;

public class ListaAlumnos {
	public static void main(String[] args) {
		ArrayList<Alumno> l = new ArrayList<>();
		
		l.add(new Alumno(34343434,"Luis", "1 DAM"));
		l.add(new Alumno(89868857,"Pedro", "1 DAM"));
		l.add(new Alumno(34313111,"Ana", "2 DAM"));
		l.add(new Alumno(11113134,"Marcelo", "1 SMR"));
		l.add(new Alumno(22234323,"Pablo", "2 DAM"));
		
		System.out.println(l);
		
		//Ordenamos la lista
		Collections.sort(l);
		System.out.println(l);
		
	}
}
