package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _08RecuperarseDeExcepcion {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int edad = 0;
		
		boolean ok = false;
		while(!ok){
			try{
				System.out.println("Edad: ");
				edad = tec.nextInt();
				if(edad < 0){
					System.out.println("No puede ser nagativa");
				} else {
					ok = true;
				}
			}catch(InputMismatchException e){
				System.out.println("ERROR. Debe ser un entero");
				tec.nextLine(); //Vaciar teclado
			}
		}
		
		
		if(edad>=18) System.out.println("Mayor de edad");
		else System.out.println("Menor de edad");
	}
}
