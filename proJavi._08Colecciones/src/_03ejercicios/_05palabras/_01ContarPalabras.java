package _03ejercicios._05palabras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _01ContarPalabras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		Map <String,Integer> m = new HashMap<>();
		
		//Rompemos la frase en palabras.
		//Con StringTokenizer
		StringTokenizer st = new StringTokenizer(frase,"[ .,:;-]");
		while(st.hasMoreTokens()){
			String palabra = st.nextToken();
			//Comprobamos si está en el map
			Integer veces = m.get(palabra);
			if(veces == null) {
				m.put(palabra, 1);
			} else {
				m.put(palabra, veces + 1);
			}
		}
		System.out.println(m);
//		//Con split
//		String[] palabras = frase.split("[ .,:;-]");
//		for (int i = 0; i < palabras.length; i++) {
//			System.out.println(palabras[i]);
//		}
		
	}
}
