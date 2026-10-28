package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05QuePonerEnTry {
	public static void main(String[] args) {
		//En el bloque try debe estar la instrucción 
		//que produce la excepción y aquellas que no queremos 
		//que se ejecuten si se produce la excepcion
		
		Scanner tec = new Scanner(System.in);
		int edad = 0;
		
		//Versión mala
		System.out.println("Introduce edad: ");
		try{
			edad = tec.nextInt();
		} catch (InputMismatchException e){
			System.out.println("La edad debe ser un numero entero");
		}
		if(edad >= 18) System.out.println("Mayor de edad");
		else System.out.println("Menor de edad");
		
		//Versión buena
		System.out.println("Introduce edad: ");
		try{
			edad = tec.nextInt();
			if(edad >= 18) System.out.println("Mayor de edad");
			else System.out.println("Menor de edad");
		} catch (InputMismatchException e){
			System.out.println("La edad debe ser un numero entero");
		}
		
	}

}
