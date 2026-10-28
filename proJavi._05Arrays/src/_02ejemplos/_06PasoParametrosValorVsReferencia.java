package _02ejemplos;

import java.util.Arrays;

public class _06PasoParametrosValorVsReferencia {
	public static void main(String[] args) {
		int a = 1;
		double b = 1;
		char c = 'a';
		
		int[]  v = {1,1,1};
		
		
		System.out.format("Antes a = %d, b = %f, c = %c v = %s%n",
				a,b,c,Arrays.toString(v));
		
		modificarTodo(a,b,c,v);
		
		System.out.format("DESPUES a = %d, b = %f, c = %c v = %s%n",
				a,b,c,Arrays.toString(v));
		
		
		//Caso especial: String
		String s = "Pepe";
		System.out.println("s = " + s);
		modificarString(s);
		System.out.println("s = " + s);
		
		
	}
	public static void modificarTodo(int a, double b, char c, int[] v){
		a = 2;
		b = 2;
		c = 'b';
		v[0] = 2;
		v[1] = 2;
		v[2] = 2;
	}
	public static void modificarString(String s){
		s = "JUAN";
	}
}
