package _02ejemplos._02figuras;

import javafx.scene.paint.Color;

public class Circulo extends Figura{
	
	private int radio;
		
	public Circulo(int posX, int posY, int radio, Color color){
		super(posX, posY, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double perimetro(){
		return 2 * Math.PI * radio;
	}
	public double area(){
		return Math.PI * radio * radio;
	}

}
