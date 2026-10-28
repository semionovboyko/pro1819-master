package _03ejercicios._06diccionario;

public class TestDiccionario {
	public static void main(String[] args) {
		DiccionarioBilingue d = new DiccionarioBilingue();
		
		d.anyadirTraduccion("casa", "house");
		d.anyadirTraduccion("fuego", "fire");
		d.anyadirTraduccion("casa", "home");
		d.anyadirTraduccion("hizo", "did");
		d.anyadirTraduccion("el", "the");
		d.anyadirTraduccion("en", "in");
		d.anyadirTraduccion("la", "the");
		
		System.out.println(d.traducir("Pepe hizo el fuego en la casa"));
		
		
		
	
	}

}
