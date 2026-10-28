package _02ejemplos;

import java.util.Scanner;

public class _12LanzarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce nº mes: ");
		int m = tec.nextInt();
		System.out.println(nombreMes1(m));
		try{
			System.out.println(nombreMes2(m));
		} catch (IllegalArgumentException e){
			System.out.println("mes incorrecto");
		}
	}
	//¿Que pasa si el mes que se recibe es incorrecto?

	//- Asumir que va a ser correcto: En main no se detecta error
	public static String nombreMes1 (int mes) {
		String nombre;
		switch (mes){
		case 1: nombre = "ene"; break;
		case 2: nombre = "feb"; break;
		case 3: nombre = "mar"; break;
		case 4: nombre = "abr"; break;
		case 5: nombre = "may"; break;
		case 6: nombre = "jun"; break;
		case 7: nombre = "jul"; break;
		case 8: nombre = "ago"; break;
		case 9: nombre = "sep"; break;
		case 10: nombre = "oct"; break;
		case 11: nombre = "nov"; break;
		default: nombre = "dic"; break;
		}
		return nombre;
	}
	//- No permitir que sea incorrecto
	public static String nombreMes2 (int mes) {
		String nombre;
		switch (mes){
		case 1: nombre = "ene"; break;
		case 2: nombre = "feb"; break;
		case 3: nombre = "mar"; break;
		case 4: nombre = "abr"; break;
		case 5: nombre = "may"; break;
		case 6: nombre = "jun"; break;
		case 7: nombre = "jul"; break;
		case 8: nombre = "ago"; break;
		case 9: nombre = "sep"; break;
		case 10: nombre = "oct"; break;
		case 11: nombre = "nov"; break;
		case 12: nombre = "dic"; break;
		default: throw new IllegalArgumentException("Valores permitidos 1 a 12");
		}
		return nombre;
	}

}
