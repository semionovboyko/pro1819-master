package _02ejemplos._06Genericidad;

public class TestEquipoOrdenado {
	public static void main(String[] args) {
		EquipoOrdenado<String> eq1 = new EquipoOrdenado<>("nombres");
		eq1.anyadir("Miguel");
		eq1.anyadir("Bea");
		eq1.anyadir("Ana");
		eq1.setCapitan("Bea");
		System.out.println(eq1);
		
		
		EquipoOrdenado<Futbolista> eq2 = new EquipoOrdenado<>("Profes matisse");
		
		
		eq2.anyadir(new Futbolista("Javi"));
		eq2.anyadir(new Futbolista("Jorge"));
		eq2.anyadir(new Futbolista("Esther"));
		eq2.anyadir(new Futbolista("Chema"));
		eq2.setCapitan(new Futbolista("Esther"));
		
		System.out.println(eq2);		
	}
}
