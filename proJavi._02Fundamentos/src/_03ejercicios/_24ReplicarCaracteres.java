package _03ejercicios;

import java.util.Scanner;

public class _24ReplicarCaracteres {
	public static void main(String[] args) {
		Scanner tec  = new Scanner (System.in);
		System.out.println("Letra: ");
		char l = tec.next().charAt(0);
		System.out.println("Veces: ");
		int v = tec.nextInt();
		
		System.out.println(replicar(l,v));
	}
	
	public static String replicar (char letra, int veces){
		int cont = 0;
		String resultado = "";
		while (cont < veces) {
			resultado = resultado + letra;
			cont = cont + 1;
		}
		
		return resultado;
	}
}
