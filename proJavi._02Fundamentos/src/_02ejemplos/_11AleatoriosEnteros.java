package _02ejemplos;

public class _11AleatoriosEnteros {
	public static void main(String[] args) {

		double a1 = Math.random();
		System.out.println("Aleat [0, 1 [: " + a1);
		System.out.println("Aleat [0, 10]: " + (int)(a1 * 11));
		System.out.println("Aleat [10, 15]: " + (int)(10 + a1 * 6));
		
	}
}
