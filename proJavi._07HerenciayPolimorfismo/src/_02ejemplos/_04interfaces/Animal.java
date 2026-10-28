package _02ejemplos._04interfaces;

public abstract class Animal {
	private String nombre;

	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public abstract String sonido();
	public abstract String alimentar();

	public String toString() {
		return "Me llamo " + nombre + " y mi sonido característico es " + sonido();
	}
}
