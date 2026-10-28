package _02ejemplos;

import java.util.Scanner;

public class _04LeerEdadYTelefono {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tu edad ");
		int edad = tec.nextInt();
		System.out.println("Introduce tu telefono ");
		int tel = tec.nextInt();
		
		System.out.println("Tienes " + edad + " años y tu tel. es " + tel);
	}
}
