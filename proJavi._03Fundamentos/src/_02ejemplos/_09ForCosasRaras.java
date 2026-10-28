package _02ejemplos;

import java.util.Scanner;

public class _09ForCosasRaras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int cont, positivos;

		//Leer 5 numeros y contar los positivos
		//Forma correcta: 
		positivos = 0;
		for(cont = 0; cont < 5; cont++){
			System.out.println("Introduce numero:");
			int num = tec.nextInt();
			if(num > 0){
				positivos ++;
			}
		}
		System.out.println("Positivos: " + positivos);
		
		//"Cosa rara" 1: Dejar partes vacias
		cont = 0;
		for ( ;cont < 5; ) {
			System.out.println("Introduce numero:");
			int num = tec.nextInt();
			if(num > 0){
				positivos ++;
			}
			cont++;
		}
		
		//Cosa rara 2: Varias instrucciones en inicio o avance
		for(cont = 0, positivos = 0; cont < 5; cont ++){
			System.out.println("Introduce numero:");
			int num = tec.nextInt();
			if(num > 0){
				positivos ++;
			}
		}
		
		//Cosar rara 3: Inicializar variables que no tienen
		//que ver con la condicion
		
		cont = 0;
		for(positivos = 0; cont < 5; cont ++){
			System.out.println("Introduce numero:");
			int num = tec.nextInt();
			if(num > 0){
				positivos ++;
			}
		}
		
	}
}
