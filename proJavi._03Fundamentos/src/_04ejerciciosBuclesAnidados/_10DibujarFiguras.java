package _04ejerciciosBuclesAnidados;

import java.util.Scanner;

public class _10DibujarFiguras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Altura: ");
		int alto = tec.nextInt();
		System.out.println("Anchura: ");
		int ancho = tec.nextInt();
		
		dibujarRectNumeros3(ancho, alto);
		
	}
	public static void dibujarRectAsteriscos(int ancho, int alto){
		for(int i = 1; i <= alto; i++){
			for(int j = 1; j <= ancho; j++){
				System.out.print("* ");
			}
			//Salto de línea
			System.out.println();
		}
	}
	public static void dibujarRectNumeros1(int ancho, int alto){
		for(int i = 1; i <= alto; i++){
			for(int j = 1; j <= ancho; j++){
				System.out.print(j +" ");
			}
			//Salto de línea
			System.out.println();
		}
	}
	public static void dibujarRectNumeros2V1(int ancho, int alto){
		for(int i = 1; i <= alto; i++){
			for(int j = 1; j <= ancho; j++){
				System.out.print((ancho - j + 1) +" ");
			}
			//Salto de línea
			System.out.println();
		}
	}
	public static void dibujarRectNumeros2V2(int ancho, int alto){
		for(int i = 1; i <= alto; i++){
			for(int j = ancho; j >= 1; j--){
				System.out.print(j +" ");
			}
			//Salto de línea
			System.out.println();
		}
	}
	public static void dibujarRectNumeros3(int ancho, int alto){
		int num = 1;
		for(int i = 1; i <= alto; i++){
			for(int j = 1; j <= ancho; j++){
				System.out.format("%02d ", num);
				num++;
			}
			//Salto de línea
			System.out.println();
		}
	}
}
