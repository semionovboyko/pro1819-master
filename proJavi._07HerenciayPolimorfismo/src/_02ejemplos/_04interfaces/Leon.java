package _02ejemplos._04interfaces;

public class Leon extends Felino {
	public Leon(String nombre){
		super(nombre);
	}

	@Override
	public String sonido() {
		return "AAAAARRRRGGGGGG";
	}
	public String alimentar(){
		return "Carne";
	}
}
