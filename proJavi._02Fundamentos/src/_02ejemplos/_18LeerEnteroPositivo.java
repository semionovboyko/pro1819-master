package _02ejemplos;

import java.util.Scanner;

public class _18LeerEnteroPositivo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce entero mayor o igual a cero: ");
		int num = tec.nextInt();
		while(num < 0){
			System.out.println("Tiene que ser mayor o igual a cero");
			System.out.println("Vuelve a intentarlo: ");
			num = tec.nextInt();
		}
		
		System.out.println("El numero introducido es: " + num);
	}
}
