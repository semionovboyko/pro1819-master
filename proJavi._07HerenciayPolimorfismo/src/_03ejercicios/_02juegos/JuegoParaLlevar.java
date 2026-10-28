package _03ejercicios._02juegos;

public abstract class JuegoParaLlevar extends Juego {

	protected double precio;
	protected int copias;

	public JuegoParaLlevar(String titulo, String fabricante, int anyo) {
		super(titulo, fabricante, anyo);
	}

	public double getPrecio() {
		return precio;
	}

	public int getCopias() {
		return copias;
	}

}