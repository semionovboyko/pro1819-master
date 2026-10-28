package _02ejemplos._04interfaces;

public class Gato extends Felino implements Mascota{
	public Gato(String nombre){
		super(nombre);
	}

	@Override
	public String sonido() {
		return "MIAUUUUUU";
	}
	public String alimentar(){
		return "Pienso para gatos";
	}
	public String jugar(){
		return "Tirame el ovillo de lana";
	}
}
