package _02ejemplos._04interfaces;

public class Perro extends Canino implements Mascota {
	public Perro(String nombre){
		super(nombre);
	}

	@Override
	public String sonido() {
		return "GUAU GUAU";
	}
	public String alimentar(){
		return "Pienso para perros";
	}
	public String jugar(){
		return "Tirame el palo";
	}
}
