package _02ejemplos._05interfaceComparable;

import java.util.Arrays;

public class TestOrdenar {
	public static void main(String[] args) {
		Integer[] a1 = {5,1,3,2,4,9};
		String[] a2 = {"casa","asa","puerto","mano"};
		Vehiculo[] a3 = {
				new Vehiculo("2342KST","FORD","FIESTA"),
				new Vehiculo("1332CCC","RENAULT","MEGANE"),
				new Vehiculo("1923DFF","KIA","CARNIVAL"),
				new Vehiculo("623SFGH","CITROEN","C3"),
		};
		
		//Ordenamos array de Integer
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));

		Arrays.sort(a3);
		System.out.println(Arrays.toString(a3));

	}

}
