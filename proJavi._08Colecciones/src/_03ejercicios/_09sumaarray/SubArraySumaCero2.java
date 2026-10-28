package _03ejercicios._09sumaarray;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumaCero2 {
	public static void main(String[] args) {
		//int [] v = {2,1,1,1,-1,-2, 1,1,1,1,1,1,1,1,1,0,1};
		//int [] v = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int v[] = new int [10000000];
		for (int i = 0; i < v.length; i++) {
			v[i] = 1;
		}	
				
		long t1 = System.currentTimeMillis();		
		boolean enc = false;

		//Map con: <Lo que suma el array, posicion en que lo suma>
		Map<Integer,Integer> m = new HashMap<>();
		
		int suma = 0;
		for (int i = 0; i < v.length && !enc; i++) {
			suma += v[i];
			Integer pos = m.get(suma);
			if(pos == null){
				//Guardo la suma y la posicion en la que estoy
				m.put(suma, i);
			} else {
				System.out.format("%d a %d suma 0%n",pos+1, i);
				enc = true;
			}
		}
		if(!enc){
			System.out.println("No hay secuencias que sumen 0");
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
	}

}
