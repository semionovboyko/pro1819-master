package _02ejemplos._06Genericidad;

public class TestEquipo {
	public static void main(String[] args) {
		//Usando la clase genérica Equipo<T> puedo
		// crear equipos de cualquier cosa
		Equipo <Futbolista> eqFutbol = new Equipo<>("Profes matisse CF");
		eqFutbol.anyadir(new Futbolista("Javi"));
		eqFutbol.anyadir(new Futbolista("Jorge"));
		eqFutbol.anyadir(new Futbolista("Esther"));
		eqFutbol.anyadir(new Futbolista("Chema"));
		eqFutbol.setCapitan(new Futbolista("Esther"));
		//En Equipo<Futbolista> solo se pueden añadir Futbolistas.
		//De lo contrario el programa no compila: 
		//eqFutbol.anyadir("Hola");
		//eqFutbol.anyadir(new Baloncestista("Antonio"));
		
		System.out.println(eqFutbol);
		
		Equipo <Baloncestista> eqBaloncesto = new Equipo<>("Matisse CB");
		eqBaloncesto.anyadir(new Baloncestista("Raúl"));
		eqBaloncesto.anyadir(new Baloncestista("Miguel"));
		eqBaloncesto.anyadir(new Baloncestista("José Luis"));
		eqBaloncesto.anyadir(new Baloncestista("Antonio"));
		
		eqBaloncesto.setCapitan(new Baloncestista("Antonio"));
		System.out.println(eqFutbol);
	}

}
