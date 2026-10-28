package _02ejemplos;

import java.util.Random;

public class _12ClaseRandom {
	public static void main(String[] args) {
		//Existe una clase llamada Random que se usa para generar 
		//numeros aleatorios
		Random r1 = new Random();
		System.out.println("Entero: " + r1.nextInt());
		System.out.println("Entero en [0,10[: " + r1.nextInt(10));
		System.out.println("Double en [0,1[: " + r1.nextDouble());
		System.out.println("Boolean: " + r1.nextBoolean());
		
		//Podemos utilizar una semilla, que permitirá 
		//reproducir siempre los mismos números aleatorios
		Random r2 = new Random(12);
		System.out.println("Entero: " + r2.nextInt());
		System.out.println("Entero en [0,10[: " + r2.nextInt(10));
		System.out.println("Double en [0,1[: " + r2.nextDouble());
		System.out.println("Boolean: " + r2.nextBoolean());
		
	}

}
