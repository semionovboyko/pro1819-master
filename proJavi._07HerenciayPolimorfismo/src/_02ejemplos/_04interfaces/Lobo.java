package _02ejemplos._04interfaces;

public class Lobo extends Canino {
	public Lobo(String nombre){
		super(nombre);
	}

	@Override
	public String sonido() {
		return "AAAUUUUUUUUU";
	}
	public String alimentar(){
		return "Carne";
	}
}
