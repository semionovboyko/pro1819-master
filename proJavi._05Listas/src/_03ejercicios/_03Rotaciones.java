package _03ejercicios;

import java.util.ArrayList;

public class _03Rotaciones {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i = 1; i<=6; i++){
			numeros.add(i);
		}
		System.out.println(numeros);
		//Rotaciones
		for(int i = 0; i < numeros.size(); i++){
			rotarIzquierda(numeros);
			System.out.println(numeros);
		}
	}
	public static void rotarDerecha(ArrayList<Integer> a){
		//Obtengo último elemento
		Integer ultimo = a.get(a.size()-1);
		//Elimino último elemento
		a.remove(a.size()-1);
		//Lo inserto al principio
		a.add(0,ultimo);
	}

	public static void rotarIzquierda(ArrayList<Integer> a){
		//Obtengo el primer elemento
		Integer primero = a.get(0);
		//Elimino primer elemento
		a.remove(0);
		//Añado al final
		a.add(primero);
	}

}
