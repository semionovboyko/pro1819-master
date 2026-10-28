package _02ejemplos._01tiempo;

public class _05IncrementarTiempo {
	public static void main(String[] args) {
		Tiempo t = new Tiempo(0,0,0);
		System.out.println(t);
		t.anyadirSegundos(3725);
		System.out.println(t);
	}
}
