package _02ejemplos;

import java.util.Scanner;

public class _11DoWhile {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Cuando usamos do-while donde deberíamos usar while
		//hay que proteger el bucle con un if
		
		//Ejemplo: mostrar los positivos entre 1 y n
		System.out.println("Introduce n");
		int n = tec.nextInt();

		System.out.println("Con while");
		int num = 1;
		while (num <= n) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("Con do while");
		num = 1;
		if(num <= n){
			do {
				System.out.println(num);
				num++;
			} while (num <= n);
		}
		
	}
}
