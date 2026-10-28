package _02ejemplos._06Genericidad;

public class TestEquipoFutbol {
	public static void main(String[] args) {
		EquipoFutbol equipo = new EquipoFutbol("Profes matisse");
		
		
		equipo.anyadir(new Futbolista("Javi"));
		equipo.anyadir(new Futbolista("Jorge"));
		equipo.anyadir(new Futbolista("Esther"));
		equipo.anyadir(new Futbolista("Chema"));
		equipo.setCapitan(new Futbolista("Esther"));
		
		System.out.println(equipo);
		
	}

}
