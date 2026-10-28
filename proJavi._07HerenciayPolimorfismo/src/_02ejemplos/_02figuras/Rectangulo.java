package _02ejemplos._02figuras;

import javafx.scene.paint.Color;

public class Rectangulo extends Figura {
	private int ancho;
	private int alto;
	
	public Rectangulo(int posX, int posY, int ancho, int alto, Color color){
		super(posX, posY, color);
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public double perimetro(){
		return 2 * (ancho + alto); 
	}
	public double area(){
		return ancho * alto;
	}
	

}
