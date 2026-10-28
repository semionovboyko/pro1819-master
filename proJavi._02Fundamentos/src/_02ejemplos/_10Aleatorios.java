package _02ejemplos;

public class _10Aleatorios {
	public static void main(String[] args) {
		double a1 = Math.random();
		System.out.println("Aleatorio [0,1 [ :" + a1 );
		System.out.println("Aleatorio [0,10[ :" + (a1*10));
		System.out.println("Aleatorio [0,5 [ :" + (a1*5));
		
		System.out.println("Aleatorio [100,110[ :" + (100 + a1 * 10));
		
		System.out.println("-----------------");
		
		double a2 = Math.random();
		System.out.println("Aleatorio [0,1[ :" + a2 );
		System.out.println("Aleatorio [0,10[ :" + (a2*10));
		System.out.println("Aleatorio [0,5 [ :" + (a2*5));

		System.out.println("Aleatorio [100,110[ :" + (100 + a2 * 10));

	}
}
