package _03ejercicios._01varios;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class _01Varios {
	public static void main(String[] args) {
		interseccion();
	}

	public static void quitarDuplicados(){
		//Usamos un ArrayList para saber si el valor
		//ya ha aparecido
		ArrayList<Integer> aparecidos = new ArrayList<>();
		
		int [] valores = {2,7,2,3,7,4,8,9};
		for (int i = 0; i < valores.length; i++) {
			if(!aparecidos.contains(valores[i])){
				System.out.println(valores[i]);
				aparecidos.add(valores[i]);
			}
		}
	}
	public static void quitarDuplicados2(){
		//Usamos un ArrayList para saber si el valor
		//ya ha aparecido
		LinkedHashSet<Integer> aparecidos = new LinkedHashSet<>();
		
		int [] valores = {2,7,2,3,7,4,8,9};
		for (int i = 0; i < valores.length; i++) {
			aparecidos.add(valores[i]);
		}
		for(Integer i: aparecidos){
			System.out.println(i);
		}
	}

	public static void union(){
		int [] v1 = {2,7,2,3,7,4,8,9};
		int [] v2 = {1,2,3,4,5,6,7};
		LinkedHashSet<Integer> union = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			union.add(v1[i]);
		}
		for (int i = 0; i < v2.length; i++) {
			union.add(v2[i]);
		}
		for(Integer i: union){
			System.out.println(i);
		}
		
	}
	public static void interseccion(){
		int [] v1 = {2,7,2,3,7,4,8,9};
		int [] v2 = {1,2,3,4,5,6,7};
		LinkedHashSet<Integer> interseccion = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				if(v1[i] == v2[j]){
					interseccion.add(v1[i]);
				}
			}
		}
		for(Integer i: interseccion){
			System.out.println(i);
		}
	}
	public static void interseccion2(){
		int [] v1 = {2,7,2,3,7,4,8,9};
		int [] v2 = {1,2,3,4,5,6,7};
		LinkedHashSet<Integer> valores1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> valores2 = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			valores1.add(v1[i]);
		}
		for (int i = 0; i < v2.length; i++) {
			valores2.add(v2[i]);
		}
		valores1.retainAll(valores2);
		for(Integer i: valores1){
			System.out.println(i);
		}
	}
	public static void diferencia(){
		int [] v1 = {2,7,2,3,7,4,8,9};
		int [] v2 = {1,2,3,4,5,6,7};
		LinkedHashSet<Integer> valores1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> valores2 = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			valores1.add(v1[i]);
		}
		for (int i = 0; i < v2.length; i++) {
			valores2.add(v2[i]);
		}
		valores1.removeAll(valores2);
		for(Integer i: valores1){
			System.out.println(i);
		}
	}
}
