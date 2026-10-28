package _02ejemplos._01Listas;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestCompararRecorridos {
	public static void main(String[] args) {
		final int VECES = 1000000;
		ArrayList<Integer> l1 = new ArrayList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		long t1, t2;

		for (int i = 0; i <= VECES; i++) {
			l1.add(10);
			l2.add(10);
		}

		// Recorrido de arrayList
		t1 = System.currentTimeMillis();
		for (int i = 0; i < l1.size(); i++) {
			int num = l1.get(i);
			if (num < 0)
				System.out.println(num);
		}
		t2 = System.currentTimeMillis();
		System.out.println("Recorrido arrayList " + (t2 - t1));

		// Recorrido de linkedList
		t1 = System.currentTimeMillis();
		//INEFICIENTE
//		for (int i = 0; i < l2.size(); i++) {
//			int num = l2.get(i);
//			if (num < 0)
//				System.out.println(num);
//		}
		
		//EFICIENTE
		for(int num: l2){
			if (num < 0)
				System.out.println(num);
		}
		t2 = System.currentTimeMillis();
		System.out.println("Recorrido LinkedList " + (t2 - t1));

	}
}
