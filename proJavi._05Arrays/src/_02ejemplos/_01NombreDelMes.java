package _02ejemplos;

import java.util.Scanner;

public class _01NombreDelMes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero de mes: ");
		int mes = tec.nextInt();
		
		System.out.println("Nombre del mes: " + nombreMes(mes));
		System.out.println("Nombre del mes: " + nombreMes2(mes));
	}
	
	public static String nombreMes(int mes){
		String[] nombre = {"", "ene", "feb", "mar",
							"abr", "may", "jun", 
							"jul", "ago", "sep",
							"oct", "nov", "dic"};
		
		String resultado = nombre[mes];
		
		return resultado;
	}
	public static String nombreMes2(int mes){
		String[] nombre = {"ene", "feb", "mar",
							"abr", "may", "jun", 
							"jul", "ago", "sep",
							"oct", "nov", "dic"};
		
		String resultado = nombre[mes-1];
		
		return resultado;
	}
}
