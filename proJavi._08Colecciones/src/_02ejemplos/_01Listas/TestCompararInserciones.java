package _02ejemplos._01Listas;

public class TestCompararInserciones {
	public static void main(String[] args) {
		final int VECES = 40000000;
		LinkedLista<Integer> l1 = new LinkedLista<>();
		LinkedLista<Integer> l2 = new LinkedLista<>();
//		ArrayLista<Integer> l1 = new ArrayLista<>();
//		ArrayLista<Integer> l2 = new ArrayLista<>();
		long t1, t2;
		
		t1 = System.currentTimeMillis();
		for(int i = 0; i<= VECES; i++){
			l1.add(10);
		}
		t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		t1 = System.currentTimeMillis();
		for(int i = 0; i<= VECES; i++){
			//Insertar al principio
			l2.add(0,10);
		}
		t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
		
	}
}
