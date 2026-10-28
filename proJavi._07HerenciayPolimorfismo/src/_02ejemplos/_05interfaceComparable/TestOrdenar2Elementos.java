package _02ejemplos._05interfaceComparable;

import java.util.Arrays;

public class TestOrdenar2Elementos {
	public static void ordenar(int[] v){
		if(v[0] > v[1]){
			int aux = v[1];
			v[1] = v[0];
			v[0] = aux;
		}
	}
	public static void ordenar(double[] v){
		if(v[0] > v[1]){
			double aux = v[1];
			v[1] = v[0];
			v[0] = aux;
		}
	}
	
	public static void ordenar(Object[] v){
		if(((Comparable)v[0]).compareTo(v[1]) > 0){
			Object aux = v[1];
			v[1] = v[0];
			v[0] = aux;
		}
	}
	
	
	public static void main(String[] args) {
		int[] a1 = {20,13};
		double[] a2 = {20.185,13.887};
		String[] a3 = {"Miguel","Luis"};
		Vehiculo[] a4 = {
				new Vehiculo("2342KST","FORD","FIESTA"),
				new Vehiculo("1332CCC","RENAULT","MEGANE")
		};	
		
		ordenar(a1);
		System.out.println(Arrays.toString(a1));
		ordenar(a2);
		System.out.println(Arrays.toString(a2));
		ordenar(a3);
		System.out.println(Arrays.toString(a3));
		ordenar(a4);
		System.out.println(Arrays.toString(a4));
		
	}
}
